package org.example;

public class Account()
{
    private string _nom = "";
    private string _prenom = "";
    private bool _decouvert = false;
    private double _montantDecouvert = 0;
    private double _montantInitialDepot = 0;


    public string getNom() {
        return _nom;
    }
 
    public string setNom(string nom) {
        this._nom = nom;
    }

    public string getPrenom() {
        return _prenom;
    }
 
    public string setPrenom(string prenom) {
        this._prenom = prenom;
    }


    public bool getDecouvert() {
        return _decouvert;
    }
 
    public bool setDecouvert(int decouvert) {
        this._decouvert = decouvert;
    }


    public double getMontantDecouvert() {
        return _montantdecouvert;
    }
 
    public void setMontantDecouvert(double montantDecouvert) {
        this._montantDecouvert = montantDecouvert;
    }


    public double getMontantInitialDepot() {
        return _montantInitialDepot;
    }
 
    public void setMontantInitialDepot(double montantInitialDepot) {
        this._montantInitialDepot = montantInitialDepot;
    }

}