package Streams.Excersises;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
Utwórz kolekcję z 10 imionami (W kolekcji musi pojawić się imię Jan). Korzystając ze strumieni znajdź imię Jan i wyświetl je.
 */
public class Main2 {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Jan", "Zenon", "Jan", "Karol", "Mario", "Anna", "Piotr", "Marek", "Marta", "Kuba");

        String lookingForJan = names.stream()
                .filter(name ->name.contains("Jan"))
                .map(name->name.toUpperCase())
                .collect(Collectors.joining(", "));
        System.out.println(lookingForJan);


    }

}
