package Streams.Excersises;

import java.util.*;

/*
Utwórz kolekcję z 6 liczbami. Korzystając z strumieni znajdź maksymlną i minimalną liczbę znajdującą się w kolekcji.
 */
public class Main4 {

    public static void main(String[] args) {

        Random random = new Random();


        List<Integer> numbers = new ArrayList<Integer>();

        for (int i = 0; i < 6; i++) {
            numbers.add(random.nextInt(20));
        }

        IntSummaryStatistics statitics = numbers.stream()
                .mapToInt(number ->number)
                .summaryStatistics();
        System.out.println(numbers);
        System.out.println("Minimalna liczba: " + statitics.getMin());
        System.out.println("Maksymalna liczba: " + statitics.getMax());
        System.out.println("Srednia liczba: " + statitics.getAverage());

    }
}
