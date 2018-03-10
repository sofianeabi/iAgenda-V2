package com.projet.iagenda.iagenda;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class VueAjoutEvenementCache extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vue_ajout_evenement_cache);

        FloatingActionButton boutonValider = (FloatingActionButton) findViewById(R.id.boutonValider);
        boutonValider.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(VueAjoutEvenementCache.this, VueConsulterEvenementCache.class);
                startActivity(intent);
            }
        });

        FloatingActionButton boutonRetour = (FloatingActionButton) findViewById(R.id.boutonRetour);
        boutonRetour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(VueAjoutEvenementCache.this, VueCalendrierCache.class);
                startActivity(intent);
            }
        });
    }
}
