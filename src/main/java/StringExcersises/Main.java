package StringExcersises;

/*
Wczytaj imię od użytkownika, następnie wyświetl napis, np. "Cześć Gienek! Jak się masz?". Użyj StringBuildera i metody append().
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String name;

        Scanner input = new Scanner(System.in);

        System.out.println("Podaj imię: ");
        name = input.nextLine();

        StringBuilder greetings = new StringBuilder().append("Cześć ").append(name).append("! Jak się masz?");

        System.out.println(greetings);


    }

}
