package Collections;
/*
Dodaj 5 imion do kolekcji. Wybierz tą kolekcję, która posortuje wprowadzone wartość. Po dodaniu elementów wyświetl wrzystkie.
 */

import java.util.Set;
import java.util.TreeSet;

public class Main1 {

    public static void main(String[] args) {

        TreeSet<String> namesSet = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
        namesSet.add("JAN");
        namesSet.add("WITKACY");
        namesSet.add("PIOTR");
        namesSet.add("ASIA");
        namesSet.add("ZENON");
        namesSet.add("ADAM");

        System.out.println(namesSet);
        System.out.println("First element: " + namesSet.first());
        System.out.println("Last element: " + namesSet.last());

    }


}
