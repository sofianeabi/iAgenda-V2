package com.projet.iagenda.iagenda;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.CalendarView;
import android.widget.ListView;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FloatingActionButton boutonAjouterEvenement = (FloatingActionButton) findViewById(R.id.bouttonAjouterEvenement);
        boutonAjouterEvenement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, VueAjoutEvenement.class);
                startActivity(intent);
            }
        });

        FloatingActionButton boutonListe = (FloatingActionButton) findViewById(R.id.bouttonVueListe);
        boutonListe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, VueListe.class);
                startActivity(intent);
            }
        });

        FloatingActionButton boutonConnexion = (FloatingActionButton) findViewById(R.id.boutonConnexion);
        boutonConnexion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, VueConnexion.class);
                startActivity(intent);
            }
        });

        CalendarView calendrier = (CalendarView) findViewById(R.id.calendarView2);
        String selectedDate = "01/01/2018";
        try {
            calendrier.setDate(new SimpleDateFormat("dd/MM/yyyy").parse(selectedDate).getTime(), true, true);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        ArrayList<String> listEvent = new ArrayList<String>();
        listEvent.add("Lundi 01 Janvier");
        listEvent.add("Rendez-vous président : 12h00");
        listEvent.add("Rendez-vous dentiste : 20h30");
        listEvent.add("Mardi 02 Janvier");
        listEvent.add("Rendez-vous garagiste : 08h30");
        listEvent.add("Déjeuné avec Christine : 12h15");
        listEvent.add("Mercredi 03 Janvier");

        ListView listView =  (ListView) findViewById(R.id.listeEvenement);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                listEvent);

        listView.setAdapter(arrayAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
