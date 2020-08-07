package com.octest.beans;

import java.util.Scanner;

public class Auteur {
    private String nom;
    private String prenom;
    private boolean actif;

    public Auteur() {

    }

    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public boolean isActif() {
        return actif;
    }
    public void setActif(boolean actif) {
        this.actif = actif;
    }

    public Auteur(Scanner sc) {
        this.scanNom(sc);
        this.scanPrenom(sc);

    }

    private void scanNom(Scanner sc) {
    }
    private void scanPrenom(Scanner sc){
    }


    public void setPrenom() {
    }

    public void setNom() {
    }
}
