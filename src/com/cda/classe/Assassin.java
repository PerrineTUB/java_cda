package com.cda.classe;

public class Assassin extends Personnage{
    private int bonusAttaque;
    public Assassin (String nom, int vie, int attaque, int defense, int bonusAttaque){
        super(nom, vie, attaque, defense);
        this.bonusAttaque = bonusAttaque;
    }

    public int getBonusAttaque() {
        return bonusAttaque;
    }

    public void setBonusAttaque(int bonusAttaque) {
        this.bonusAttaque = bonusAttaque;
    }

    @Override
    public void attaquer(Personnage newPerso){
        double luck = Math.random();
        if (luck <= 0.05) {
            super.setAttaque(super.getAttaque() + bonusAttaque);
        }
    };

}
