package com.cda.interfaces;

public class Part {
    //Attributes
    private Perso perso1;
    private Perso perso2;
    private int nbrTour;

    //Constructor
    public Part(Perso joueur1, Perso joueur2, int nbrT){
        this.perso1 = joueur1;
        this.perso2 = joueur2;
        this.nbrTour = nbrT;
    }

    //Getters and Setters
    public Perso getPerso1() {
        return perso1;
    }

    public void setPerso1(Perso perso1) {
        this.perso1 = perso1;
    }

    public Perso getPerso2() {
        return perso2;
    }

    public void setPerso2(Perso perso2) {
        this.perso2 = perso2;
    }

    public int getNbrTour() {
        return nbrTour;
    }

    public void setNbrTour(int nbrTour) {
        this.nbrTour = nbrTour;
    }

    //Methods
    public String launchParty(){
        String msg = "";
        while(this.nbrTour > 0 ){
            this.perso1.attaquer(this.perso2);

            if(this.perso2.getVie() <= 0 ) {
                msg = "Le joueur " + this.perso1.getNom() + " à gagné !";
                this.nbrTour = 0;
            }

            this.perso2.attaquer(this.perso1);

            if(this.perso1.getVie() <= 0 ) {
                msg = "Le joueur " + this.perso2.getNom() + " à gagné !";
                this.nbrTour = 0;
            }

            this.nbrTour --;
        }

         if (this.perso1.getVie() > 0  && this.perso2.getVie() > 0 ) {
                msg = "Egalité !";
         }

        return msg;
    }
}
