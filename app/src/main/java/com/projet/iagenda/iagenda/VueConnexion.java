package com.projet.iagenda.iagenda;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class VueConnexion extends AppCompatActivity {
    AlertDialog.Builder dlgAlert ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        dlgAlert = new AlertDialog.Builder(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vue_connexion);

        FloatingActionButton boutonConnexionVueConnexion = (FloatingActionButton) findViewById(R.id.boutonConnexionVueConnexion);
        boutonConnexionVueConnexion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText texteChampUtilisateur = (EditText)findViewById(R.id.champUtilisateur);
                String valeurChampUtilisateur = texteChampUtilisateur.getText().toString();

                EditText texteChampMotDePasse = (EditText)findViewById(R.id.champMotDePasse);
                String valeurChampMotDePasse = texteChampMotDePasse.getText().toString();

                System.out.println("User : " + valeurChampUtilisateur);
                System.out.println("Password : " + valeurChampMotDePasse);

                if ((valeurChampUtilisateur.equals("admin")) && (valeurChampMotDePasse.equals("123"))){
                    Intent intent = new Intent(VueConnexion.this, VueCalendrierCache.class);
                    startActivity(intent);
                }else{
                    dlgAlert.setMessage("Identifiants erronés : Pour utiliser les identifiants de démonstration, entrez l'utilisateur admin et le mot de passe 123");
                    dlgAlert.setTitle("Identifiants erronés");
                    dlgAlert.setPositiveButton("OK", null);
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();
                }
            }
        });

        FloatingActionButton boutonRetourVueConnexion = (FloatingActionButton) findViewById(R.id.boutonRetourVueConnexion);
        boutonRetourVueConnexion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(VueConnexion.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
