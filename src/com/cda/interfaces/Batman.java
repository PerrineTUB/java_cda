package com.cda.interfaces;

public class Batman extends Perso implements Competence {

    int bonusAttaque; 
    public Batman (String nom, int vie, int attaque, int defense, int bonusAtt){
        super(nom, vie, attaque, defense);
        this.bonusAttaque = bonusAtt;
    }

    public int getBonusAttaque() {
        return bonusAttaque;
    }

    public void setBonusAttaque(int bonusAttaque) {
        this.bonusAttaque = bonusAttaque;
    }

    @Override
    public void attack(Perso cible) {
        cible.setVie((cible.getVie()+cible.getDefense())- (super.getAttaque() + this.getBonusAttaque()));
        System.out.println("Il reste " + cible.getVie() + " points de vie à " + cible.getNom());
    }
}
