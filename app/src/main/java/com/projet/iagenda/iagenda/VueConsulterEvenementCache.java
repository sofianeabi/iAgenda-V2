package com.projet.iagenda.iagenda;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class VueConsulterEvenementCache extends AppCompatActivity {

    public static String heureDebutCache = "";
    public static String nomCache = "";
    public static String titreEvenementCache = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vue_consulter_evenement_cache);

        FloatingActionButton boutonSupprimerEvenementCacheVueConsulterEvenementCache = (FloatingActionButton) findViewById(R.id.boutonSupprimerEvenementCacheVueConsulterEvenementCache);
        boutonSupprimerEvenementCacheVueConsulterEvenementCache.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(VueConsulterEvenementCache.this, VueSuppressionEvenementCache.class);
                startActivity(intent);
            }
        });

        FloatingActionButton boutonModifierEvenementCacheVueConsulterEvenementCache = (FloatingActionButton) findViewById(R.id.boutonModifierEvenementCacheVueConsulterEvenementCache);
        boutonModifierEvenementCacheVueConsulterEvenementCache.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(VueConsulterEvenementCache.this, VueModifierEvenementCache.class);
                startActivity(intent);
            }
        });

        EditText texteHeureDebutCache = (EditText) findViewById(R.id.editTextHeureDebutCache);
        texteHeureDebutCache.setText(VueCalendrierCache.heureRendezVousCache);
        heureDebutCache = VueCalendrierCache.heureRendezVousCache;
        TextView textViewNomCache = (TextView) findViewById(R.id.textViewNomCache);
        textViewNomCache.setText(VueCalendrierCache.personneRendezVousCache);
        nomCache = VueCalendrierCache.personneRendezVousCache;
        TextView textViewTitreEvenementCache = (TextView) findViewById(R.id.textViewTitreEvenementCache);
        textViewTitreEvenementCache.setText(VueCalendrierCache.rendezVousCache);
        titreEvenementCache = VueCalendrierCache.rendezVousCache;
    }
}
