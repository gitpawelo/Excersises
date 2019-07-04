package Collections;
/*
Jesteś osobą przetwarzająca zadania w kolejnośći w jakiej do Ciebie przyszły (kolejka FIFO).
Wykorzstaj do tego odpowiednią kolekcję. Dodaj 10 zadań, a następnie pobierz je z kolekcji w takiej kolejności
w jakiej zostały do niej dodane.
 */

import java.util.ArrayDeque;
import java.util.Queue;

public class Main5 {

    public static void main(String[] args) {

        Queue<String> sequences = new ArrayDeque<>();

        sequences.add("Zrób A!");
        sequences.add("Zrób B!");
        sequences.add("Zrób C!");
        sequences.add("Zrób D!");
        sequences.add("Zrób E!");
        sequences.add("Zrób F!");
        sequences.add("Zrób G!");

        for (String result: sequences
             ) {
            System.out.println(result+ ", ");
        }
    }

}
