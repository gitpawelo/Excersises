package Excersises1;

/*
4. Napisz program, który zapyta ożytkownika o wiek, a następnie wypisze czy jest pełnoletni
4.a Dodaj zabezpieczenie przed wpisaniem liczby mniejszej niż 1 oraz wypisanie specjalnego komunikatu, kiedy użytkownik ma więcej niż 100 lat
4.b Zrealizuj zabezpieczenie za pomocą wyjątku
 */

import Methods.MethodsAdult;

import java.util.Scanner;

public class Main6 {

    public static void main(String args[]) {

        int age;
        Scanner inputValue = new Scanner(System.in);
        MethodsAdult methodsAdult = new MethodsAdult();

        System.out.println("How old are are?");

        age = inputValue.nextInt();
        methodsAdult.checkAdult(age);

    }

}
