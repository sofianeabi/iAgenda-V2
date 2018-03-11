package com.projet.iagenda.iagenda;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class VueConsulterEvenement extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vue_consulter_evenement2);
        FloatingActionButton boutonModifierEvenement = (FloatingActionButton) findViewById(R.id.boutonModifierEvenement);
        boutonModifierEvenement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(VueConsulterEvenement.this, VueModifierEvenement.class);
                startActivity(intent);
            }
        });
    }
}
