package com.cda.classe;

public class Partie {
    private Personnage joueur1;
    private Personnage joueur2;
    private int nbrTour;

    public Partie(Personnage perso1, Personnage perso2, int nbrTour) {
        this.joueur1 = perso1;
        this.joueur2 = perso2;
        this.nbrTour = nbrTour;
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

    public String lancerPartie() {
        String message =  "";
        while (nbrTour > 0) {
            this.joueur1.attaquer(this.joueur2);
            this.joueur2.attaquer(this.joueur1);

            if (this.joueur2.getVie() <= 0) {
                message = "Le gagnant est " + this.joueur1.getNom();
                this.nbrTour = 0;
            }
            if (this.joueur1.getVie() <= 0) {
                message = "Le gagnant est " + this.joueur2.getNom();
                this.nbrTour = 0;
            }
            this.nbrTour--;
        }
        //if (this.joueur1.getVie() >0 && this.joueur2.getVie() > 0 ){
            //message = "Egalité !";
        //}
        return message;
    }

}