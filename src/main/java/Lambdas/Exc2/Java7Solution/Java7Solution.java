package Lambdas.Exc2.Java7Solution;

import Lambdas.Exc2.Person;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Java7Solution {

    public static void main(String[] args) {

        List<Person> personList = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Caroll", 40),
                new Person("Jan", "Kowalski", 25),
                new Person("Stefan", "Nowak", 20),
                new Person("Ludwik", "Kot", 50)
        );
// 1. Sort people by lastname
        Collections.sort(personList, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getLastname().compareTo(o2.getLastname());
            }
        });
        printAllPeople(personList);

        System.out.println("\nNazwiska zaczynające się na literę K");
        printAllPeopleWithCondition(personList, new Condition(){

            @Override
            public boolean test(Person person) {
               return person.getLastname().startsWith("K");
            }
        });

        System.out.println("\nImoina zaczynajace się na literę L");
        printAllPeopleWithCondition(personList, new Condition() {
            @Override
            public boolean test(Person person) {
                return person.getName().startsWith("L");
            }
        });

    }

    // 2. Create method that will print elements from the list.
    public static void printAllPeople(List<Person> people){
        for (Person result: people
             ) {
            System.out.println(result);
        }
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
