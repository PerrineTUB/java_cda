package com.cda.classe;

public class Assassin extends Personnage {
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

        if (Math.random() * 100 > 94.99) {
            newPerso.setVie(newPerso.getVie() -(this.bonusAttaque + this.getAttaque() - newPerso.getDefense()) );
        } else {
            super.attaquer(newPerso);
        }
    };

}
