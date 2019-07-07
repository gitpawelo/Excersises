package Streams.Excersises.FilmApp;

import Streams.Excersises.FilmApp.Model.Film;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {


        List<Film> filmList = Arrays.asList(
                new Film("Predator",
                        "James Cameron",
                        LocalDate.of(1980, 02, 9),
                        29.99,
                        Arrays.asList("Arnold Szwajceneger"),
                        Arrays.asList("sci-fi", "horror")),

                new Film("Wladca Pierscieni",
                        "Tolkien",
                        LocalDate.of(1999, 10, 25),
                        59.99,
                        Arrays.asList("John Travolta", "Johny Rambo"),
                        Arrays.asList("sci-fi", "fantasy")),

                new Film("Star Trek",
                        "Steven Spilberg",
                        LocalDate.of(1980, 01, 18),
                        79.99,
                        Arrays.asList("Brad Pitt", "Johny Rambo"),
                        Arrays.asList("history", "comedy")),

                new Film("Hobbit",
                        "Tolkien",
                        LocalDate.of(2002, 11, 03),
                        109.99,
                        Arrays.asList("John Travolta", "Bryan Adams"),
                        Arrays.asList("sci-fi", "fantasy"))
        );


        List<String> getAllTitles = filmList.stream()
                .map(film -> film.getTitle())
                .collect(Collectors.toList());
        System.out.println("Lista filmów: " + getAllTitles);

        List<String> filmsMadeByTolkien = filmList.stream()
                .filter(film -> film.getDirector().equals("Tolkien"))
                .map(film -> film.getTitle())
                .collect(Collectors.toList());
        System.out.println("Filmy wyreżyserowane przez Tolkiena: " + filmsMadeByTolkien);

        LocalDate year2000 = LocalDate.of(2000,01,01);

        List<String> filmsBefore2000 = filmList.stream()
                .filter(film -> film.getYear().isBefore(year2000))
                .map(film -> film.getTitle())
                .collect(Collectors.toList());
        System.out.println("Filmy przed rokiem 2000: " + filmsBefore2000);

        String cheaperThan80 = filmList.stream()
                .filter(film -> film.getPrice()<80)
                .map(film -> film.getTitle())
                .collect(Collectors.joining(" | "));
        System.out.println("Filmy z ceną poniżej 80zł; " + cheaperThan80);

        DoubleSummaryStatistics statistics = filmList.stream()
                .mapToDouble(film ->film.getPrice())
                .summaryStatistics();
        System.out.println("Srednia cena filmu: " + statistics.getAverage());
        System.out.println("Minimalna cena filmu " + statistics.getMin());
        System.out.println("Maksymalna cena filmu " + statistics.getMax());

        List<String> filmsWithTravolta = filmList.stream()
                .filter(film -> film.getActors().contains("John Travolta"))
                .map(film -> film.getTitle())
                .collect(Collectors.toList());
        System.out.println("Filmy z Travoltą: " + filmsWithTravolta);

        Map<String, Double> worthMoreThan80 = filmList.stream()
                .filter(film -> film.getPrice()>statistics.getAverage())
                .collect(Collectors.toMap(film -> film.getTitle(), film -> film.getPrice()));

        System.out.println("Filmy warte wiecej niż srednia cena wszystkich filmów: " + worthMoreThan80);

    }
}