package com.example.sge2.controller;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.sge2.R;
import com.example.sge2.modele.Utilisateur;
import com.example.sge2.modele.Utils;

public class LoginActivity extends AppCompatActivity {

    private TextView deLoginARegisterTextView;
    private Button connexionButton;
    private EditText nomUtilisateurEditText;
    private EditText motDePasseEditText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        deLoginARegisterTextView = findViewById(R.id.idAllerARegister);
        connexionButton = findViewById(R.id.idconnexion);
        nomUtilisateurEditText= findViewById(R.id.idLoginUserName);
        motDePasseEditText = findViewById(R.id.idLoginPassword);

        String prefUserName = getSharedPreferences(Utils.SHARED_PREF_USERINFO,MODE_PRIVATE).getString(Utils.SHARED_PREF_USERNAME,null);
        String prefPassword = getSharedPreferences(Utils.SHARED_PREF_USERINFO,MODE_PRIVATE).getString(Utils.SHARED_PREF_PASSWORD,null);

        if(prefUserName!=null && prefPassword!=null)
        {
            nomUtilisateurEditText.setText(prefUserName);
            motDePasseEditText.setText(prefPassword);
        }

        connexionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(nomUtilisateurEditText.getText().toString().equals(prefUserName) && motDePasseEditText.getText().toString().equals(prefPassword))
                {
                    Intent FromLoginToMain = new Intent(connexionButton.getContext(), MainActivity.class);
                    startActivity(FromLoginToMain);
                } else{

                    AlertDialog.Builder builderDialog = new AlertDialog.Builder(connexionButton.getContext());
                    builderDialog
                            .setTitle("Connexion")
                            .setMessage("Utilisateur non enregistré, Veuillez d'abord vous enregistrer !")
                            .setPositiveButton("OK",null)
                            .show();}

                }


        });
















        deLoginARegisterTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent FromLoginToMain = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(FromLoginToMain);
            }
        });







    }
}