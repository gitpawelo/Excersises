package Lambdas.Exc2.Java8Solution;

import Lambdas.Exc2.Person;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Java8Solution {

    public static void main(String[] args) {

        List<Person> personList = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Caroll", 40),
                new Person("Jan", "Kowalski", 25),
                new Person("Stefan", "Nowak", 20),
                new Person("Ludwik", "Kot", 50)
        );
// 1. Sort people by lastname
        Collections.sort(personList, (p1, p2) -> p1.getLastname().compareTo(p2.getLastname()));

        printAllPeopleWithCondition(personList, p ->true);

        System.out.println("\nNazwiska zaczynające się na literę K");
        printAllPeopleWithCondition(personList, p-> p.getLastname().startsWith("K"));

        System.out.println("\nImoina zaczynajace się na literę L");
        printAllPeopleWithCondition(personList, p -> p.getName().startsWith("L"));

    }
    // 3. Create method that will print elements from the list with lastname starts with K
    public static void printAllPeopleWithCondition(List<Person> people, Condition condition){
        for (Person result: people
             ) {
            if (condition.test(result)){
                System.out.println(result);
            }

        }
    }
}

interface Condition{
    boolean test(Person person);

}
