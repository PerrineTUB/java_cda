//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Exemple test = new Exemple();
        Exemple test2 = new Exemple("Tubia", "Perrine");
        System.out.println(test2.nom);
        Exemple test3 = test;
    }
}