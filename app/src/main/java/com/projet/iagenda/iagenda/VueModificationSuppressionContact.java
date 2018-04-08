package com.projet.iagenda.iagenda;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.NumberPicker;
import android.widget.TextView;

import org.w3c.dom.Text;

public class VueModificationSuppressionContact extends AppCompatActivity {

    private Button alertButton;
    private TextView alertTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vue_modification_suppression_contact);
        alertTextView = (TextView) findViewById(R.id.AlertTextView);
        Intent intent = getIntent();
        String code = intent.getStringExtra("code");


        final TextView textViewNom = (TextView) findViewById(R.id.editTextNom);
        final TextView textViewPrenom = (TextView) findViewById(R.id.editTextPrenom);
        TextView textViewPhone = (TextView) findViewById(R.id.editTextTelephone);
        TextView textViewAdresse = (TextView) findViewById(R.id.editTextAdresse);
        TextView textViewMail = (TextView) findViewById(R.id.editTextMail);
        TextView textViewNote = (TextView) findViewById(R.id.editTextNote);
        TextView numberPicker = (TextView) findViewById(R.id.editTextNumber);
        ImageView iv = (ImageView) findViewById(R.id.imageView);



        switch (code){
            case "1":
                textViewNom.setText("Martin");
                textViewPrenom.setText("Isabelle");
                textViewPhone.setText("06 05 06 05 06");
                textViewAdresse.setText("02 rue du janvier");
                textViewMail.setText("i.martini@gmail.com");
                textViewNote.setText("Une énigme");
                numberPicker.setText("2");
                break;
            case "2":
                textViewNom.setText("Stratow");
                textViewPrenom.setText("Yvana");
                textViewPhone.setText("06 13 52 00 06");
                textViewAdresse.setText("12 avenue du printemps");
                textViewMail.setText("Y.Stratow@gmail.com");
                textViewNote.setText("Le printemps arrive");
                numberPicker.setText("8");
                iv.setImageResource(R.drawable.woman2);
                break;
            case "3":
                textViewNom.setText("Fernand");
                textViewPrenom.setText("Yhira");
                textViewPhone.setText("06 52 36 75 09");
                textViewAdresse.setText("52 rue du pellican");
                textViewMail.setText("y.Fernand@laposte.net");
                textViewNote.setText("La chaleur de l'espagne");
                numberPicker.setText("9");
                iv.setImageResource(R.drawable.woman3);
                break;
            case "4":
                textViewNom.setText("Yuri");
                textViewPrenom.setText("Marina");
                textViewPhone.setText("07 55 66 55 76");
                textViewAdresse.setText("68 rue de l'armistice");
                textViewMail.setText("M.Yuri@russia.com");
                textViewNote.setText("La fraicheur russe");
                numberPicker.setText("6");
                iv.setImageResource(R.drawable.woman4);
                break;

        }




        findViewById(R.id.boutonSupprimerContactCache).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(VueModificationSuppressionContact.this);
                builder.setCancelable(true);
                builder.setTitle("Suppression de contact ");
                builder.setMessage("Voulez-vous réellement supprimer " + textViewNom.getText() + " " + textViewPrenom.getText() + " de la liste des contacts ?");


                builder.setNegativeButton("Annuler", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });

                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        // alertTextView.setVisibility(View.VISIBLE);
                    }
                });
                builder.show();
            }
        });



    }


}
