package Streams.Excersises;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/*
Utwórz nieposortowaną kolekcję z 10 dowolnymi i unikatowymi imionami. Korzystając ze strumieni posortuj kolekcję i wyświetl ją.
 */
public class Main3 {

    public static void main(String[] args) {

        Set<String> names = new HashSet<>();

        names.add("Adam");
        names.add("Karolina");
        names.add("Asia");
        names.add("Anatol");
        names.add("Andrzej");
        names.add("Halina");
        names.add("Waldek");
        names.add("Krzysztof");
        names.add("Eufenia");
        names.add("Adam");
        names.add("Zenon");
        names.add("Adam");


        List<String> sortedNames = names.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(sortedNames);
    }
}
