import com.cda.classe.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Exemple test = new Exemple();
        Exemple test2 = new Exemple("Tubia", "Perrine");
        //System.out.println(test2.nom);

        Habitation maison1 = new Habitation("maison 1 ", 5, 5,2);

        Vehicule voiture1 = new Vehicule("Audi", 4, 250);
        Vehicule voiture2 = new Vehicule("Bm", 2, 250);

        voiture1.Boost();

        Personnage perso1 = new Personnage("Perso1", 10, 5, 3);
        Personnage perso2 = new Personnage("Perso2", 10, 5, 3);

        //System.out.println("Vie perso 2 avant attaque: " + perso2.getVie());
        //perso1.attaquer(perso2);
        //System.out.println("Vie perso 2 après attaque: " + perso2.getVie());

        //System.out.println("Le véhicule " + voiture1.getNom() + " est de type : " + voiture1.Detect());
        //System.out.println("Le véhicule " + voiture2.getNom() + " est de type : " + voiture2.Detect());
        //System.out.println("Le véhicule " + voiture1.getNom() + " possède une vitesse de : " + voiture1.getVitesse() + "Km/h");
        //System.out.println(voiture1.plusRapide(new Vehicule("Jeep", 4, 300)));

        Partie partie1 = new Partie(perso1, perso2, 3);
        System.out.println(partie1.lancerPartie());
    }
}