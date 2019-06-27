package Generics.Excersise2;

import Generics.Excersise2.GenClass.GenClass;

public class Main {

    public static void main(String[] args) {

        GenClass<Integer> intGen = new GenClass<>(88);
        intGen.showType();

        GenClass<String> strGen = new GenClass<String>("Hello");
        strGen.showType();

        int v = intGen.getObject();
        System.out.println(v);
        String str = strGen.getObject();
        System.out.println(str);

    }
}
