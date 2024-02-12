package com.cda.classe;

public class Guerrier extends Personnage {
    private int bonusDefense;

    public Guerrier (String nom, int vie, int attaque, int defense, int bonusDefense){
        super(nom, vie, attaque, defense);
        this.bonusDefense = bonusDefense;
    }

    public int getBonusDefense() {
        return bonusDefense;
    }

    public void setBonusDefense(int bonusDefense) {
        this.bonusDefense = bonusDefense;
    }

    public void attaquer(Personnage cible){
        double luck = Math.random();
        if (luck <= 0.05) {
            super.setDefense(super.getDefense() + bonusDefense);
        }
    }
}
