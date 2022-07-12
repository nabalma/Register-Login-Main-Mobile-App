package com.example.sge2.controller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.sge2.R;
import com.example.sge2.modele.Utils;

public class MainActivity extends AppCompatActivity {

    private TextView prefUserNameTextView;
    private TextView prefPasswordTextView;
    private TextView prefNomTextView;
    private TextView prefPrenomTextView;
    private TextView prefSexeTextView;
    private TextView prefDateNaissanceTextView;
    private TextView prefNumeroTelephoneTextView;

    private Button effacerDonneesButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        prefUserNameTextView=findViewById(R.id.idPrefUserName);
        prefPasswordTextView=findViewById(R.id.idPrefPassword);
        prefNomTextView=findViewById(R.id.idPrefNom);
        prefPrenomTextView=findViewById(R.id.idPrefPrenom);
        prefSexeTextView=findViewById(R.id.idPrefSexe);
        prefDateNaissanceTextView=findViewById(R.id.idPrefDateNaissance);
        prefNumeroTelephoneTextView=findViewById(R.id.idPrefNumeroTelephone);


        effacerDonneesButton=findViewById(R.id.idEffacerDonnees);



        String prefUserName = getSharedPreferences(Utils.SHARED_PREF_USERINFO,MODE_PRIVATE).getString(Utils.SHARED_PREF_USERNAME,null);
        prefUserNameTextView.setText(" "+prefUserName);

        String prefPassword = getSharedPreferences(Utils.SHARED_PREF_USERINFO,MODE_PRIVATE).getString(Utils.SHARED_PREF_PASSWORD,null);
        prefPasswordTextView.setText(" "+prefPassword);

        String prefNom = getSharedPreferences(Utils.SHARED_PREF_USERINFO,MODE_PRIVATE).getString(Utils.SHARED_PREF_NAME,null);
        prefNomTextView.setText(" "+prefNom);

        String prefPrenom = getSharedPreferences(Utils.SHARED_PREF_USERINFO,MODE_PRIVATE).getString(Utils.SHARED_PREF_LASTNAME,null);
        prefPrenomTextView.setText(" "+prefPrenom);

        String prefsexe = getSharedPreferences(Utils.SHARED_PREF_USERINFO,MODE_PRIVATE).getString(Utils.SHARED_PREF_SEXE,null);
        prefSexeTextView.setText(" "+prefsexe);

        String prefDateNaissance = getSharedPreferences(Utils.SHARED_PREF_USERINFO,MODE_PRIVATE).getString(Utils.SHARED_PREF_BIRTHDATE,null);
        prefDateNaissanceTextView.setText(" "+prefDateNaissance);

        String prefNumerTelephone = getSharedPreferences(Utils.SHARED_PREF_USERINFO,MODE_PRIVATE).getString(Utils.SHARED_PREF_TELEPHONE,null);
        prefNumeroTelephoneTextView.setText(" "+prefNumerTelephone);



        effacerDonneesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSharedPreferences(Utils.SHARED_PREF_USERINFO,MODE_PRIVATE).edit().clear().commit();
            }
        });


    }
}