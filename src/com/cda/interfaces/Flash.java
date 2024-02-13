package com.cda.interfaces;

public class Flash extends Perso implements Competence {

        int bonusVie; 
    
        public Flash (String nom, int vie, int attaque, int defense, int bonusVie){
            super(nom, vie, attaque, defense);
            this.bonusVie = bonusVie;
        }

        @Override
        public void attack(Perso cible) {
            cible.setVie((cible.getVie()+cible.getDefense()) - (super.getAttaque()+5));
            System.out.println("Il reste " + cible.getVie() + " points de vie à " + cible.getNom());
        }


}
