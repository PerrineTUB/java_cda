import com.cda.classe.Exemple;
import com.cda.classe.Habitation;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Exemple test = new Exemple();
        Exemple test2 = new Exemple("Tubia", "Perrine");
        System.out.println(test2.nom);

        Habitation maison1 = new Habitation("maison 1 ", 5, 5,2);

        System.out.println("L'habitation: " + maison1.getNom() + ", à une surface de :" + maison1.surface() + "m².");
    }
}