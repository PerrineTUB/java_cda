package com.cda.classe;

public class Exemple {
    public String nom;
    public String prenom;

    public Exemple(){}
    public Exemple(String lastname,String firstname){
        this.nom = lastname;
        this.prenom = firstname;
    }

    //override une methode, redéfinit une méthode
    public String toString(){
        return this.nom + " " + this.prenom;
    }
}
