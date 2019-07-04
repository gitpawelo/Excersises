package Streams.Excersises;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/*
1. Utwórz kolekcję, na następnie dodaj do niej 5 imion. Korzystając z Stream zmodyfikuj kolekcję tak, aby imiona były
pisane dużymi literami (UPPERCASE) a następnie wyświelt wszystkie imiona.
 */
public class Main1 {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Jan", "Zenon", "Halina", "Karol", "Mario");

        List<String> upperCaseNames = names.stream()
                .map(name -> name.toUpperCase())
                .collect(Collectors.toList());

        System.out.println(upperCaseNames);
    }

}
