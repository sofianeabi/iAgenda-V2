package com.projet.iagenda.iagenda;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class VueConnexion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vue_connexion);

        FloatingActionButton boutonConnexionVueConnexion = (FloatingActionButton) findViewById(R.id.boutonConnexionVueConnexion);
        boutonConnexionVueConnexion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(VueConnexion.this, VueCalendrierCache.class);
                startActivity(intent);
            }
        });

        FloatingActionButton boutonRetourVueConnexion = (FloatingActionButton) findViewById(R.id.boutonRetourVueConnexion);
        boutonRetourVueConnexion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(VueConnexion.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
