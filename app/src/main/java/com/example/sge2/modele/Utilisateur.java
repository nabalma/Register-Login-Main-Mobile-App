package com.example.sge2.modele;

public class Utilisateur {

    private String nomUtilisateur;
    private String motDePasse;
    private String nom;
    private String prenom;
    private String sexe;
    private String dateDeNaissance;
    private String numeroTelephone;

    public Utilisateur(String nomUtilisateur, String motDePasse, String nom, String prenom, String sexe, String dateDeNaissance, String numeroTelephone) {
        this.nomUtilisateur = nomUtilisateur;
        this.motDePasse = motDePasse;
        this.nom = nom;
        this.prenom = prenom;
        this.sexe = sexe;
        this.dateDeNaissance = dateDeNaissance;
        this.numeroTelephone = numeroTelephone;
    }

    public Utilisateur(String nomUtilisateur, String motDePasse) {
        this.nomUtilisateur = nomUtilisateur;
        this.motDePasse = motDePasse;
    }


    public String getNomUtilisateur() {
        return nomUtilisateur;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getSexe() {
        return sexe;
    }

    public String getDateDeNaissance() {
        return dateDeNaissance;
    }

    public String getNumeroTelephone() {
        return numeroTelephone;
    }

    public void setNomUtilisateur(String nomUtilisateur) {
        this.nomUtilisateur = nomUtilisateur;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public void setDateDeNaissance(String dateDeNaissance) {
        this.dateDeNaissance = dateDeNaissance;
    }

    public void setNumeroTelephone(String numeroTelephone) {
        this.numeroTelephone = numeroTelephone;
    }
}
