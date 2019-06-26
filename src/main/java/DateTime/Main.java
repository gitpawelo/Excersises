package DateTime;

/*
Wypisz na ekranie aktualny czas, datę oraz czas i datę.
Wczytaj od użytkownika dwie daty i wyświetl która jest wcześniejsza.
Wczytaj od użytkownika datę i godzinę, wyświetl na ekranie jaka jest teraz data i godzina w Los Angeles i Tokio.
 */

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        LocalDateTime timeNow = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy - HH:mm:ss");
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        ZonedDateTime timeInLosAngeles = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
        ZonedDateTime timeInTokyo = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));

        System.out.println("Czas w Los Angeles: " + timeInLosAngeles.format(dateTimeFormatter));
        System.out.println("Czas w Tokyo: " + timeInTokyo.format(dateTimeFormatter));

        Scanner input = new Scanner(System.in);

        System.out.println("Obecna godzina data i czas " + timeNow.format(dateTimeFormatter));
        System.out.println("Wprowadź pierwszą datę w formacie dd/MM/yyyy");

        String date1 = input.nextLine();

        System.out.println("Wprowadź drugą datę w formacie dd/MM/yyyy");

        String date2 = input.nextLine();
        LocalDate firstDate = LocalDate.parse(date1, dateTimeFormatter1);
        LocalDate secondDate = LocalDate.parse(date2, dateTimeFormatter1);

        if (firstDate.isAfter(secondDate)){
            System.out.println("Data " + secondDate + " jest wcześniejsza niż " + firstDate);
        }else if (firstDate.isBefore(secondDate)){
            System.out.println("Data " + secondDate + " jest późniejsza niż " + firstDate);
        }else {
            System.out.println("Obydwie daty są takie same");
        }


    }

}
