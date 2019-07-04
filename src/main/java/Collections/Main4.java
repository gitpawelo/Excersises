package Collections;
/*
Jesteś firmą produkującą tabliczki z imionami. Dla każdego imienia musisz przygotować matrycę. Raz przygotowana matryca
może być wykorzystywana wielokrotnie. Korzystająć z odpowiedniej kolekcji dodaj do niej imiona (co najmniej 10) osób tak aby
w kolekcji się nie powtarzały. Podczas dodawania dodaj kilka imion powtarzających się.
 */

import java.util.HashSet;
import java.util.Set;

public class Main4 {

    public static void main(String[] args) {

        Set<String> nameMatrix = new HashSet<>();

        nameMatrix.add("Adam");
        nameMatrix.add("Karolina");
        nameMatrix.add("Asia");
        nameMatrix.add("Anatol");
        nameMatrix.add("Andrzej");
        nameMatrix.add("Halina");
        nameMatrix.add("Waldek");
        nameMatrix.add("Krzysztof");
        nameMatrix.add("Eufenia");
        nameMatrix.add("Adam");
        nameMatrix.add("Zenon");
        nameMatrix.add("Adam");

        System.out.println(nameMatrix.size());

        for (String result: nameMatrix
             ) {
            System.out.print(result + ", ");
        }
    }
}
