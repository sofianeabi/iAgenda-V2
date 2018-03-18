package com.projet.iagenda.iagenda;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class VueModifierEvenementCache extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vue_modifier_evenement_cache);

        FloatingActionButton boutonRetourVueModifierEvenementCache = (FloatingActionButton) findViewById(R.id.boutonRetourVueModifierEvenementCache);
        boutonRetourVueModifierEvenementCache.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(VueModifierEvenementCache.this, VueConsulterEvenementCache.class);
                startActivity(intent);
            }
        });


        FloatingActionButton boutonValiderVueModifierEvenementCache = (FloatingActionButton) findViewById(R.id.boutonValiderVueModifierEvenementCache);
        boutonValiderVueModifierEvenementCache.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(VueModifierEvenementCache.this, VueConsulterEvenementCache.class);
                startActivity(intent);
            }
        });


        EditText texteHeureDebutCache = (EditText) findViewById(R.id.dateDebutVueModifierEvenement);
        texteHeureDebutCache.setText(VueCalendrierCache.heureRendezVousCache);
        TextView textViewNomCache = (TextView) findViewById(R.id.champSelectionContactVueModifierEvenementCache);
        textViewNomCache.setText(VueCalendrierCache.personneRendezVousCache);
        TextView textViewTitreEvenementCache = (TextView) findViewById(R.id.champTitreVueModifierEvenement);
        textViewTitreEvenementCache.setText(VueCalendrierCache.rendezVousCache);
    }
}
