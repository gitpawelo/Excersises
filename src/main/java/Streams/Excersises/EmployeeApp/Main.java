package Streams.Excersises.EmployeeApp;

import Streams.Excersises.EmployeeApp.Model.Employee;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

/*
Utwórz klasę pracownik posiadającą imię, nazwisko i wynagrodzenie. Dodaj 10 pracowników do kolekcji ArrayList.
Korzystając ze strumieni znajdź średnie wynagrodzenie pracownika, a następnie korzystając ze strumieni wyświelt
wszystkich pracowników zarabiających więcej niż średnia.
 */
public class Main {
    public static void main(String[] args) {

        List<Employee> empoloyeeArray = Arrays.asList(
                new Employee("Jan", "Kowalski", (3300)),
                new Employee("Zenon", "Kowalski", (4300)),
                new Employee("Andrzej", "Kowalski", (5300)),
                new Employee("Hania", "Kowalski", (6300)),
                new Employee("Jania", "Kowalski", (1700)),
                new Employee("Witold", "Kowalski", (3900)),
                new Employee("Kaswery", "Kowalski", (9000)),
                new Employee("Pamela", "Kowalski", (7800)),
                new Employee("Witold", "Kowalski", (3500)),
                new Employee("Eugeniusz", "Kowalski", (2300))
        );

        DoubleSummaryStatistics statistics = empoloyeeArray.stream()
                .mapToDouble(payment -> payment.getSalary())
                .summaryStatistics();

        double averageSalary = statistics.getAverage();
        System.out.println("Srednie wynagrodzenie: " + averageSalary);

        List<String> employeesBelowAverageSalary = empoloyeeArray.stream()
                .filter(salary -> salary.getSalary()>averageSalary)
                .map(names -> names.getName())
                .collect(Collectors.toList());

        System.out.println(employeesBelowAverageSalary);


    }

}
