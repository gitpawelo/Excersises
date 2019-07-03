package Collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set_Exc {

    public static void main(String[] args) {

        Set<String> hashSet = new HashSet<String>();

        hashSet.add("Jan");
        hashSet.add("Marysia");
        hashSet.add("Zenon");
        hashSet.add("Marysia");

        Set<String> treeSet = new TreeSet<String>();

        treeSet.add("Andrzej");
        treeSet.add("Halina");
        treeSet.add("Marysia");
        treeSet.add("Halina");

        System.out.println("Pierwszy zbiór: ");
        for (String hashSetResult: hashSet
             ) {
            System.out.println(hashSetResult);
        }

        System.out.println("Drugi zbiór: ");
        for (String treeSetResult: treeSet
             ) {
            System.out.println(treeSetResult);
        }

    }
}
