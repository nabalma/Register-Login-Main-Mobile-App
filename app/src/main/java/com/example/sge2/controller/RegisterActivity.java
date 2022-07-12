package com.example.sge2.controller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.sge2.R;
import com.example.sge2.modele.Utilisateur;
import com.example.sge2.modele.Utils;

public class RegisterActivity extends AppCompatActivity {
    private EditText nomUtilisateurEditText;
    private EditText motDePasseEditText;
    private EditText nomEditText;
    private EditText prenomEditText;
    private EditText sexeEditText;
    private EditText dateDeNaissanceEditText;
    private EditText numeroTelephoneEditText;
    private Button creerCompteButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        nomUtilisateurEditText = findViewById(R.id.idNomUtilisateur);
        motDePasseEditText = findViewById(R.id.idMotDePasse);
        nomEditText = findViewById(R.id.idNom);
        prenomEditText = findViewById(R.id.idPrenom);

        sexeEditText=findViewById(R.id.idSexe);
        dateDeNaissanceEditText=findViewById(R.id.idDateNaissance);
        numeroTelephoneEditText=findViewById(R.id.idNumeroTelephone);
        creerCompteButton=findViewById(R.id.idCreerCompte);


        creerCompteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Utilisateur utilisateur = new Utilisateur(nomUtilisateurEditText.getText().toString(),motDePasseEditText.getText().toString(),nomEditText.getText().toString(),prenomEditText.getText().toString(),sexeEditText.getText().toString(),dateDeNaissanceEditText.getText().toString(),numeroTelephoneEditText.getText().toString());
                SharedPreferences preferences=getSharedPreferences(Utils.SHARED_PREF_USERINFO,MODE_PRIVATE);

                //creer sharedPreferences
                SharedPreferences.Editor editor = preferences.edit();
                editor.putString(Utils.SHARED_PREF_USERNAME,utilisateur.getNomUtilisateur());
                editor.putString(Utils.SHARED_PREF_PASSWORD,utilisateur.getMotDePasse());
                editor.putString(Utils.SHARED_PREF_NAME,utilisateur.getNom());
                editor.putString(Utils.SHARED_PREF_LASTNAME,utilisateur.getPrenom());
                editor.putString(Utils.SHARED_PREF_SEXE,utilisateur.getSexe());
                editor.putString(Utils.SHARED_PREF_BIRTHDATE,utilisateur.getDateDeNaissance());
                editor.putString(Utils.SHARED_PREF_TELEPHONE,utilisateur.getNumeroTelephone());
                editor.apply();


                Intent FromRegisterToMain = new Intent(RegisterActivity.this, MainActivity.class);
                startActivity(FromRegisterToMain);
            }
        });




    }
}