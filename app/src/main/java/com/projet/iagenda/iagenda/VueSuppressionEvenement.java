package com.projet.iagenda.iagenda;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class VueSuppressionEvenement extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vue_suppression_evenement);

        FloatingActionButton boutonSupprimerVueSupprimerEvenement = (FloatingActionButton) findViewById(R.id.boutonSupprimerVueSupprimerEvenement);
        boutonSupprimerVueSupprimerEvenement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(VueSuppressionEvenement.this, VueConsulterEvenement.class);
                startActivity(intent);
            }
        });

        FloatingActionButton boutonRetourVueSupprimerEvenement = (FloatingActionButton) findViewById(R.id.boutonRetourVueSupprimerEvenement);
        boutonRetourVueSupprimerEvenement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(VueSuppressionEvenement.this, VueConsulterEvenement.class);
                startActivity(intent);
            }
        });



    }

}
