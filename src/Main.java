import com.cda.classe.Exemple;
import com.cda.classe.Habitation;
import com.cda.classe.Vehicule;

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

        //System.out.println("Le véhicule " + voiture1.getNom() + " est de type : " + voiture1.Detect());
        //System.out.println("Le véhicule " + voiture2.getNom() + " est de type : " + voiture2.Detect());
        //System.out.println("Le véhicule " + voiture1.getNom() + " possède une vitesse de : " + voiture1.getVitesse() + "Km/h");
        System.out.println(voiture1.plusRapide(new Vehicule("Jeep", 4, 300)));
    }
}