package com.projet.iagenda.iagenda;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
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

    }
}
