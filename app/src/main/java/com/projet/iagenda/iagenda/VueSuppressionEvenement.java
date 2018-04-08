package com.projet.iagenda.iagenda;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class VueSuppressionEvenement extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vue_suppression_evenement);

        FloatingActionButton boutonSupprimerVueSupprimerEvenement = (FloatingActionButton) findViewById(R.id.boutonSupprimerVueSupprimerEvenement);
        boutonSupprimerVueSupprimerEvenement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(VueSuppressionEvenement.this, VueConsulterEvenement.class);
                startActivity(intent);
            }
        });

        FloatingActionButton boutonRetourVueSupprimerEvenement = (FloatingActionButton) findViewById(R.id.boutonRetourVueSupprimerEvenement);
        boutonRetourVueSupprimerEvenement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(VueSuppressionEvenement.this, VueConsulterEvenement.class);
                startActivity(intent);
            }
        });


        EditText texteHeureDebut = (EditText) findViewById(R.id.dateDebutVueSupprimerEvenement);
        texteHeureDebut.setText(MainActivity.heureRendezVous);
        final TextView textViewNom = (TextView) findViewById(R.id.champSelectionContactVueSupprimerEvenement);
        textViewNom.setText(MainActivity.personneRendezVous);
        final TextView textViewTitreEvenement = (TextView) findViewById(R.id.champTitreVueSupprimerEvenement);
        textViewTitreEvenement.setText(MainActivity.rendezVous);


        findViewById(R.id.boutonSupprimerVueSupprimerEvenement).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(VueSuppressionEvenement.this);
                builder.setCancelable(true);
                builder.setTitle("Supprimer évenemment");
                builder.setMessage("Voulez-vous réélement supprimer le " + textViewTitreEvenement.getText() + " avec " + textViewNom.getText() + " ?");


                builder.setNegativeButton("Annuler", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });

                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        // alertTextView.setVisibility(View.VISIBLE);
                    }
                });
                builder.show();
            }
        });

    }

}
