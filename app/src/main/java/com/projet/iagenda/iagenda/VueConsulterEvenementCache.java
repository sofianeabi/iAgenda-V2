package com.projet.iagenda.iagenda;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class VueConsulterEvenementCache extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vue_consulter_evenement_cache);

        FloatingActionButton boutonSupprimerEvenementCache = (FloatingActionButton) findViewById(R.id.boutonSupprimerEvenementCache);
        boutonSupprimerEvenementCache.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(VueConsulterEvenementCache.this, VueCalendrierCache.class);
                startActivity(intent);
            }
        });

        FloatingActionButton boutonModifierEvenementCache = (FloatingActionButton) findViewById(R.id.boutonModifierEvenementCache);
        boutonModifierEvenementCache.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(VueConsulterEvenementCache.this, VueListeCachee.class);
                startActivity(intent);
            }
        });
    }
}
