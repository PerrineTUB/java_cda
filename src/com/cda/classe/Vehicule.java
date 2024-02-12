package com.cda.classe;

public class Vehicule {
    private String nom;
    private int nbrRoue;
    private int vitesse;

    public Vehicule(){};
    public Vehicule(String name, int nbr,int speed){
        this.nom = name;
        this.nbrRoue = nbr;
        this.vitesse = speed;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbrRoue() {
        return nbrRoue;
    }

    public void setNbrRoue(int nbrRoue) {
        this.nbrRoue = nbrRoue;
    }

    public int getVitesse() {
        return vitesse;
    }

    public void setVitesse(int vitesse) {
        this.vitesse = vitesse;
    }

    public void Boost(){
        this.vitesse += 50;
    }

    public String Detect(){
        if (this.nbrRoue == 4){
            return "voiture";
        } else if (this.nbrRoue == 2 ){
            return "moto";
        } else {
            return "Type de véhicule inconnu";
        }
    }
}
