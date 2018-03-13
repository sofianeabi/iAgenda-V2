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

        FloatingActionButton boutonRetourVueModifierEvenement = (FloatingActionButton) findViewById(R.id.boutonRetourVueModifierEvenement);
        boutonRetourVueModifierEvenement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(VueModifierEvenement.this, VueConsulterEvenement.class);
                startActivity(intent);
            }
        });

        FloatingActionButton boutonValiderVueModifierEvenement = (FloatingActionButton) findViewById(R.id.boutonValiderVueModifierEvenement);
        boutonValiderVueModifierEvenement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(VueModifierEvenement.this, VueConsulterEvenement.class);
                startActivity(intent);
            }
        });

    }
}
