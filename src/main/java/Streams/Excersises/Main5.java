package Streams.Excersises;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main5 {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("ala", "janek", "zenek", "wladek", "elzbieta", "wladimir");

        List<String> uppercases = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("Imiona z dużych liter: " + uppercases);

        Map<String, Integer> counterForLetters = names.stream()
                .filter(name -> name.length()==8)
                .collect(Collectors.toMap(name -> name.toUpperCase(), name -> name.length()));
        System.out.println("Imiona o długości równej 8 znaków: " + counterForLetters);

        //imiona polaczone srednikiem
        String joinNames = names.stream()
                .map(name -> name.toUpperCase())
                .collect(Collectors.joining("; "));
        System.out.println(joinNames);

        //suma znaków dla imion o dlugosci miedzy 3 a 6 znakow
        IntSummaryStatistics statistics = names.stream()
                .filter(name ->name.length()>3 && name.length()<6)
                .mapToInt(name -> name.length())
                .summaryStatistics();
        System.out.println(statistics.getSum());
    }
}
