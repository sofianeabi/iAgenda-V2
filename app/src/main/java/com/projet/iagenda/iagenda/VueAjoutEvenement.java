package com.projet.iagenda.iagenda;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class VueAjoutEvenement extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vue_ajout_evenement);

        FloatingActionButton boutonValiderVueAjoutEvenement = (FloatingActionButton) findViewById(R.id.boutonValiderVueAjoutEvenement);
        boutonValiderVueAjoutEvenement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(VueAjoutEvenement.this, VueConsulterEvenement.class);
                startActivity(intent);
            }
        });

        FloatingActionButton boutonRetourVueAjoutEvenement = (FloatingActionButton) findViewById(R.id.boutonRetourVueAjoutEvenement);
        boutonRetourVueAjoutEvenement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(VueAjoutEvenement.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

}