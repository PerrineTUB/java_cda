package com.cda.classe;

public class Habitation {
    private String nom;
    private double longueur;
    private double largeur;

    private int etage;

    public Habitation(){};
    public Habitation(String name, double length,double width, int stair){
        this.nom = name;
        this.longueur = length;
        this.largeur = width;
        this.etage = stair;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getLongueur() {
        return longueur;
    }

    public void setLongueur(double longueur) {
        this.longueur = longueur;
    }

    public double getLargeur() {
        return largeur;
    }

    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }

    public int getEtage(){
        return etage;
    }

    public void setEtage(int stair){
        this.etage = stair;
    }

    public double surface(){
        return (this.longueur * this.largeur) * this.etage;
    }


}
