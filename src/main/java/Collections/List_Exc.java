package Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class List_Exc {

    public static void main(String[] args) {

        List<String> arrayList = new ArrayList<>();

        arrayList.add("John");
        arrayList.add("Jan");
        arrayList.add("Ala");
        arrayList.add("John");


        List<String> anotherArrayList = new ArrayList<>();

        anotherArrayList.add("Maciej");
        anotherArrayList.addAll(arrayList);

        List<String> linkedArray = new LinkedList<String>();
        linkedArray.add("John z listy LinkedList");

        anotherArrayList.addAll(linkedArray);


        System.out.println("Pierwsza lista: ");
        for (String resultArray1: arrayList
             ) {
            System.out.println(resultArray1);
        }

        System.out.println("Druga lista: ");
        for (int i = 0; i < anotherArrayList.size(); i++) {
            System.out.println(anotherArrayList.get(i));
        }

        System.out.println("Czy lista zawiera imię Maciej? " + anotherArrayList.contains("Maciej"));
        System.out.println("Czy lista zawiera imię Jacek? " + anotherArrayList.contains("Jacek"));
        System.out.println("Wielkość listy: " + anotherArrayList.size());
        System.out.println("Czy lista jest pusta? " + anotherArrayList.isEmpty());
        System.out.println("Indeks pierwszego wystąpienia imienia John: " + anotherArrayList.indexOf("John"));
        System.out.println("Indeks ostatniego wystąpienia imienia John: " + anotherArrayList.lastIndexOf("John"));

        anotherArrayList.remove("John");

        System.out.println("Druga lista: ");
        for (int i = 0; i < anotherArrayList.size(); i++) {
            System.out.println(anotherArrayList.get(i));
        }


    }

}
