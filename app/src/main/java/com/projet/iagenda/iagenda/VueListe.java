package com.projet.iagenda.iagenda;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class VueListe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vue_liste);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton bouttonAjoutEvenement = (FloatingActionButton) findViewById(R.id.bouttonAjoutEvenement);
        bouttonAjoutEvenement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(VueListe.this, VueAjoutEvenement.class);
                startActivity(intent);
            }
        });

        FloatingActionButton bouttonVueCalendrier = (FloatingActionButton) findViewById(R.id.bouttonVueCalendrier);
        bouttonVueCalendrier.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(VueListe.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

}
