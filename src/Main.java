//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String modele = "..\\d+.";
        System.out.println(("nac2").matches(modele));

        String un = "allo";
        System.out.println(un.matches("\\d{4}"));//faux

        String deux = " dede";
        System.out.println(deux.matches("\\s{1,}[a-e]{2,5}")); //vrai

        String trois = "343---";
        System.out.println(trois.matches("...\\w\\w\\w")); // false

        String quatre = "2222";
        System.out.println(quatre.matches("22")) ; //false

        String cinq = "sage";
        System.out.println(cinq.matches("\\s.{3}")) ; //faux

        String six = "éric";
        System.out.println(six.matches("\\w{4}")) ; //faux

        String sept = "éric";
        System.out.println ( sept.matches("[\\wé]{4}")); //true

        String huit = "6320759";
        System.out.println(huit.matches("[\\d]{7}"));




    }
}