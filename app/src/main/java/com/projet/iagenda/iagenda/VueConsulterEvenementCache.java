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

        FloatingActionButton boutonSupprimerEvenementCacheVueConsulterEvenementCache = (FloatingActionButton) findViewById(R.id.boutonSupprimerEvenementCacheVueConsulterEvenementCache);
        boutonSupprimerEvenementCacheVueConsulterEvenementCache.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(VueConsulterEvenementCache.this, VueSuppressionEvenement.class);
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
    }
}
