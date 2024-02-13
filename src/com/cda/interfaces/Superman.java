package com.cda.interfaces;

public class Superman extends Perso implements Competence {
    
    int bonusDefense;
    public Superman (String nom, int vie, int attaque, int defense, int bonusDef){
        super(nom, vie, attaque, defense);
        this.bonusDefense = bonusDef;
    }

    public int getBonusDefense() {
        return bonusDefense;
    }

    public void setBonusDefense(int bonusDefense) {
        this.bonusDefense = bonusDefense;
    }

    @Override
    public void attack(Perso cible) {
        cible.setVie((cible.getVie()+cible.getDefense()) - (super.getAttaque()* 2) );
        System.out.println("Il reste " + cible.getVie() + " points de vie à " + cible.getNom());
    }
}
