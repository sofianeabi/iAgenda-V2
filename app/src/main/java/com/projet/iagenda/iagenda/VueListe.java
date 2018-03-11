package com.projet.iagenda.iagenda;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class VueListe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vue_liste);

        FloatingActionButton bouttonAjoutEvenement = (FloatingActionButton) findViewById(R.id.bouttonAjoutEvenement);
        bouttonAjoutEvenement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(VueListe.this, VueAjoutEvenement.class);
                startActivity(intent);
            }
        });

        FloatingActionButton bouttonVueCalendrier = (FloatingActionButton) findViewById(R.id.bouttonVueCalendrier);
        bouttonVueCalendrier.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(VueListe.this, MainActivity.class);
                startActivity(intent);
            }
        });

        ArrayList<String> listEvent = new ArrayList<String>();
        listEvent.add("Lundi 01 Janvier");
        listEvent.add("Rendez-vous président : 12h00");
        listEvent.add("Rendez-vous dentiste : 20h30");
        listEvent.add("Mardi 02 Janvier");
        listEvent.add("Rendez-vous garagiste : 08h30");
        listEvent.add("Déjeuné avec Christine : 12h15");
        listEvent.add("Mercredi 03 Janvier");

        ListView listView =  (ListView) findViewById(R.id.listeEvenements);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                listEvent);

        listView.setAdapter(arrayAdapter);
    }

}
