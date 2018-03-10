package com.projet.iagenda.iagenda;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class VueCalendrierCache extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vue_calendrier_cache);

        FloatingActionButton boutonSortirModeCache = (FloatingActionButton) findViewById(R.id.boutonSortirModeCache);
        boutonSortirModeCache.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(VueCalendrierCache.this, MainActivity.class);
                startActivity(intent);
            }
        });

        FloatingActionButton bouttonAjouterEvenementCache = (FloatingActionButton) findViewById(R.id.bouttonAjouterEvenementCache);
        bouttonAjouterEvenementCache.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(VueCalendrierCache.this, VueAjoutEvenementCache.class);
                startActivity(intent);
            }
        });

        FloatingActionButton bouttonAfficherVueListeCachee = (FloatingActionButton) findViewById(R.id.bouttonAfficherVueListeCachee);
        bouttonAfficherVueListeCachee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(VueCalendrierCache.this, VueListeCachee.class);
                startActivity(intent);
            }
        });

    }
}
