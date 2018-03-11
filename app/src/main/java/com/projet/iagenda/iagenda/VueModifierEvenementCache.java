package com.projet.iagenda.iagenda;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class VueModifierEvenementCache extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vue_modifier_evenement_cache);

        FloatingActionButton boutonRetourVueModificationEvenementPrive = (FloatingActionButton) findViewById(R.id.boutonRetourVueModificationEvenementPrive);
        boutonRetourVueModificationEvenementPrive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(VueModifierEvenementCache.this, VueConsulterEvenementCache.class);
                startActivity(intent);
            }
        });

        FloatingActionButton boutonValiderModificationContactCache = (FloatingActionButton) findViewById(R.id.boutonValiderModificationContactCache);
        boutonValiderModificationContactCache.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(VueModifierEvenementCache.this, VueConsulterEvenementCache.class);
                startActivity(intent);
            }
        });
    }
}
