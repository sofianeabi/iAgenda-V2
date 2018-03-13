package com.projet.iagenda.iagenda;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class VueModifierEvenement extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vue_modifier_evenement);

        FloatingActionButton boutonRetourVueModifierEvenementCache = (FloatingActionButton) findViewById(R.id.boutonRetourVueModifierEvenementCache);
        boutonRetourVueModifierEvenementCache.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(VueModifierEvenement.this, VueConsulterEvenement.class);
                startActivity(intent);
            }
        });

        FloatingActionButton boutonValiderVueModifierEvenementCache = (FloatingActionButton) findViewById(R.id.boutonValiderVueModifierEvenementCache);
        boutonValiderVueModifierEvenementCache.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(VueModifierEvenement.this, VueConsulterEvenement.class);
                startActivity(intent);
            }
        });

    }
}
