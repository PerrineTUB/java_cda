package com.cda.classe;

public class Personnage {
    private String nom;
    private int vie;
    private int attaque;
    private int defense;

    public Personnage(){}
    public Personnage(String name, int life, int attack, int def ){
        this.nom = name;
        this.vie = life;
        this.attaque = attack;
        this.defense = def;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getVie() {
        return vie;
    }

    public void setVie(int vie) {
        this.vie = vie;
    }

    public int getAttaque() {
        return attaque;
    }

    public void setAttaque(int attaque) {
        this.attaque = attaque;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public void attaquer(Personnage cible){
        int result = this.attaque - cible.getDefense();
        cible.setVie(cible.getVie() - result);
    }
}
