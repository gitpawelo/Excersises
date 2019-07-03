package Collections;
/*
Dodaj 10 losowych liczb do kolekcji. Korzystająć z indeksów pobierz pokolei wszystkie elementy i wyświetl je.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main2 {

    public static void main(String[] args) {

        Random randomInput = new Random(10);

        ArrayList<Integer> array = new ArrayList<>();

        for (int i = 0; i <10 ; i++) {
            array.add(randomInput.nextInt(20));
        }

        for (int i = 0; i < array.size(); i++) {
            System.out.print(array.get(i) + ", ");
        }

    }

}
