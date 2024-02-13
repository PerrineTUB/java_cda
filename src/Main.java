import com.cda.classe.*;
import com.cda.interfaces.*;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        Exemple test = new Exemple();
//        Exemple test2 = new Exemple("Tubia", "Perrine");

//         Exercice 1 et 2
//        System.out.println(test2.nom);
//        Habitation maison1 = new Habitation("maison 1 ", 5, 5, 2);

//        Exercice 3 et 4
//        Vehicule voiture1 = new Vehicule("Audi", 4, 250);
//        Vehicule voiture2 = new Vehicule("Bm", 2, 250);
//        voiture1.Boost();

//        System.out.println("Le véhicule " + voiture1.getNom() + " est de type : " + voiture1.Detect());
//        System.out.println("Le véhicule " + voiture2.getNom() + " est de type : " + voiture2.Detect());
//        System.out.println("Le véhicule " + voiture1.getNom() + " possède une vitesse de : " + voiture1.getVitesse() + "Km/h");
//        System.out.println(voiture1.plusRapide(new Vehicule("Jeep", 4, 300)));

//        Exercice 5
//        Personnage perso1 = new Personnage("Perso1", 40, 5, 3);
//        Personnage perso2 = new Personnage("Perso2", 20, 2, 3);
//
//        System.out.println("Vie perso 2 avant attaque: " + perso2.getVie());
//        perso1.attaquer(perso2);
//        System.out.println("Vie perso 2 après attaque: " + perso2.getVie());
//
//        Partie partie = new Partie(perso1, perso2, 3);
//        System.out.println(partie.lancerPartie());

//        Exercice 6
        Batman person1 = new Batman("Batman", 10, 10, 6, 10);
        Flash person2 = new Flash("Flash", 60, 150, 3, 15);
        Superman person3 = new Superman("Superman", 40, 10, 15, 5);

        //person1.attack(person2);
        //person2.attack(person1);

        Part party = new Part(person1, person2, 3);
        System.out.println(party.getPerso2().getNom());
        System.out.println(party.launchParty());

    }
}