package org.example.model;

public class Account
{
    private String Nom;
    private String Prenom;
    private boolean Decouvert;
    private double MontantDecouvert;
    private double MontantInitialDepot;


    public String getNom() {
        return Nom;
    }
 
    public void setNom(String nom) {
        Nom = nom;
    }

    public String getPrenom() {
        return Prenom;
    }
 
    public void setPrenom(String prenom) {
        Prenom = prenom;
    }


    public boolean getDecouvert() {
        return Decouvert;
    }
 
    public void setDecouvert(boolean decouvert) {
        Decouvert = decouvert;
    }


    public double getMontantDecouvert() {
        return MontantDecouvert;
    }
 
    public void setMontantDecouvert(double montantDecouvert) {
        MontantDecouvert = montantDecouvert;
    }


    public double getMontantInitialDepot() {
        return MontantInitialDepot;
    }
 
    public void setMontantInitialDepot(double montantInitialDepot) {
        MontantInitialDepot = montantInitialDepot;
    }

}