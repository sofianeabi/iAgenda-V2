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

        FloatingActionButton boutonModifierEvenement = (FloatingActionButton) findViewById(R.id.boutonModifierEvenement);
        boutonModifierEvenement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(VueModifierEvenement.this, VueConsulterEvenement.class);
                startActivity(intent);
            }
        });

        FloatingActionButton boutonRetour = (FloatingActionButton) findViewById(R.id.boutonRetour);
        boutonModifierEvenement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(VueModifierEvenement.this, VueConsulterEvenement.class);
                startActivity(intent);
            }
        });

    }
}
