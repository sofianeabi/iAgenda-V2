package com.projet.iagenda.iagenda;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class VueListeCachee extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vue_liste_cachee);

        FloatingActionButton bouttonVueCalendrierVueListeCachee = (FloatingActionButton) findViewById(R.id.bouttonVueCalendrierVueListeCachee);
        bouttonVueCalendrierVueListeCachee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(VueListeCachee.this, VueCalendrierCache.class);
                startActivity(intent);
            }
        });

        FloatingActionButton bouttonAjouterEvenementCacheVueListeCachee = (FloatingActionButton) findViewById(R.id.bouttonAjouterEvenementCacheVueListeCachee);
        bouttonAjouterEvenementCacheVueListeCachee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(VueListeCachee.this, VueAjoutEvenementCache.class);
                startActivity(intent);
            }
        });

        FloatingActionButton bouttonRetourVueListeCachee = (FloatingActionButton) findViewById(R.id.bouttonRetourVueListeCachee);
        bouttonRetourVueListeCachee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(VueListeCachee.this, VueCalendrierCache.class);
                startActivity(intent);
            }
        });

    }
}
