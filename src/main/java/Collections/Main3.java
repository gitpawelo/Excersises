package Collections;
/*
twórz kolejkę osób do lekarza. Dodaj 10 losowych osób i wyświetl pierwsza i ostatnią osobę z kolejki. Nie korzystaj z listy ArrayList.
 */

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main3 {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Jan","Gosia","Adam", "Halina", "Andrzej", "Bożena", "Bogusław", "Nikodem", "Anastazja", "Lila");

        LinkedList<String> linekdList = new LinkedList<>();
        linekdList.addAll(names);

        System.out.println("First element: " + linekdList.getFirst());
        System.out.println("Last element: " + linekdList.getLast());
    }

}
