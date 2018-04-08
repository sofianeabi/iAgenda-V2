package com.projet.iagenda.iagenda;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class VueCalendrierCache extends AppCompatActivity {

    public static String heureRendezVousCache = "";
    public static String personneRendezVousCache = "";
    public static String rendezVousCache = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vue_calendrier_cache);

        FloatingActionButton boutonSortirModeCache = (FloatingActionButton) findViewById(R.id.boutonSortirModeCache);
        boutonSortirModeCache.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(VueCalendrierCache.this, MainActivity.class);
                startActivity(intent);
            }
        });

        FloatingActionButton bouttonAjouterEvenementCache = (FloatingActionButton) findViewById(R.id.bouttonAjouterEvenementCache);
        bouttonAjouterEvenementCache.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(VueCalendrierCache.this, VueAjoutEvenementCache.class);
                startActivity(intent);
            }
        });

        FloatingActionButton boutonAfficherTableauDeChasse = (FloatingActionButton) findViewById(R.id.boutonAfficherTableauDeChasse);
        boutonAfficherTableauDeChasse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(VueCalendrierCache.this, VueTableauDeChasse.class);
                startActivity(intent);
            }
        });

        ArrayList<String> listEvent = new ArrayList<String>();
        listEvent.add("Lundi 01 Janvier");
        listEvent.add("Déjeuné Elisabeth : 12h00");
        listEvent.add("Mardi 02 Janvier");
        listEvent.add("Achat du cadeau pour Eloise : 08h30");
        listEvent.add("Anniversaire Eloise : 12h15");
        listEvent.add("Mercredi 03 Janvier");

        ListView listView =  (ListView) findViewById(R.id.listeEvenementCache);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                listEvent);

        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1,int position, long arg3)
            {
                switch (position){
                    case 1:
                        heureRendezVousCache="12H00";
                        personneRendezVousCache="Elisabeth";
                        rendezVousCache="Déjeuné";
                        break;
                    case 3:
                        heureRendezVousCache="08H30";
                        personneRendezVousCache="Eloise";
                        rendezVousCache="Achat cadeau";
                        break;
                    case 4:
                        heureRendezVousCache="12H15";
                        personneRendezVousCache="Eloise";
                        rendezVousCache="Anniversaire";
                        break;
                    default:
                        heureRendezVousCache="08H00";
                        personneRendezVousCache="Inconnu";
                        rendezVousCache="rendezVous";
                }
                if (position == 1 || position == 3 || position == 4){
                    Intent intent = new Intent(VueCalendrierCache.this, VueConsulterEvenementCache.class);
                    startActivity(intent);
                }

            }
        });
        
    }
}
