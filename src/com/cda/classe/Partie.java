package com.cda.classe;

public class Partie{

    private Personnage joueur1;
    private Personnage joueur2;
    private int nbrTour;

    public Partie(Personnage gamer1, Personnage gamer2, int steps){
        this.joueur1 = gamer1;
        this.joueur2 = gamer2;
        this.nbrTour = steps;
    }

    public Personnage getJoueur1() {
        return joueur1;
    }

    public void setJoueur1(Personnage joueur1) {
        this.joueur1 = joueur1;
    }

    public Personnage getJoueur2() {
        return joueur2;
    }

    public void setJoueur2(Personnage joueur2) {
        this.joueur2 = joueur2;
    }

    public int getNbrTour() {
        return nbrTour;
    }

    public void setNbrTour(int nbrTour) {
        this.nbrTour = nbrTour;
    }

    public String lancerPartie(){
        String msg ="";
            for (int i = 0 ; i <= this.getNbrTour(); i++) {
               this.joueur1.attaquer(this.joueur2);
               this.joueur2.attaquer(this.joueur1);

               if (this.joueur1.getVie() <= 0) {
                   msg = "Le gagnant est " + joueur2.getNom() ;
                   break;
               }
               if (this.joueur2.getVie() <= 0){
                   msg =  "Le gagnant est " + joueur1.getNom() ;
                   break;
               }
            }

        if (this.joueur1.getVie() > 0 && this.joueur2.getVie() >0){
            msg = "Egalité";
        }
        return msg;
    }
}
