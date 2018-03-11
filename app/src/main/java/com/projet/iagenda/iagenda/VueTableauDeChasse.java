package com.projet.iagenda.iagenda;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by sofiane on 11/03/2018.
 */

public class VueTableauDeChasse extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vue_tableau_de_chasse);

        FloatingActionButton boutonAjouterContactPrive = (FloatingActionButton) findViewById(R.id.boutonAjouterContactPrive);
        boutonAjouterContactPrive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(VueTableauDeChasse.this, VueModificationSuppressionContact.class);
                startActivity(intent);
            }
        });

    }
}
