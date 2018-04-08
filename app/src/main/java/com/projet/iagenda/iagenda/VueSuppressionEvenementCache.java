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

public class VueSuppressionEvenementCache extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vue_suppression_evenement_cache);

        FloatingActionButton boutonSupprimerVueSupprimerEvenementCache = (FloatingActionButton) findViewById(R.id.boutonSupprimerVueSupprimerEvenementCache);
        boutonSupprimerVueSupprimerEvenementCache.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(VueSuppressionEvenementCache.this, VueCalendrierCache.class);
                startActivity(intent);
            }
        });

        FloatingActionButton boutonRetourVueSupprimerEvenementCache = (FloatingActionButton) findViewById(R.id.boutonRetourVueSupprimerEvenementCache);
        boutonRetourVueSupprimerEvenementCache.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(VueSuppressionEvenementCache.this, VueModifierEvenementCache.class);
                startActivity(intent);
            }
        });

        EditText texteHeureDebutCache = (EditText) findViewById(R.id.dateDebutVueSupprimerEvenementCache);
        texteHeureDebutCache.setText(VueCalendrierCache.heureRendezVousCache);
        TextView textViewNomCache = (TextView) findViewById(R.id.champSelectionContactVueSupprimerEvenementCache);
        textViewNomCache.setText(VueCalendrierCache.personneRendezVousCache);
        TextView textViewTitreEvenementCache = (TextView) findViewById(R.id.champTitreVueSupprimerEvenementCache);
        textViewTitreEvenementCache.setText(VueCalendrierCache.rendezVousCache);


        findViewById(R.id.boutonSupprimerVueSupprimerEvenementCache).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(VueSuppressionEvenementCache.this);
                builder.setCancelable(true);
                builder.setTitle("Supprimer évenemment caché");
                builder.setMessage("Voulez-vous réélement supprimer le " + VueCalendrierCache.rendezVousCache + " avec " + VueCalendrierCache.personneRendezVousCache + " ?");


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
