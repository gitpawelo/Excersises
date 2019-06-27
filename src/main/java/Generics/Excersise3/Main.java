package Generics.Excersise3;

import Generics.Excersise3.GenClass.TwoGen;

public class Main {

    public static void main(String[] args) {

        TwoGen<Integer, String> twoGen = new TwoGen<>(123, "Raz dwa trzy");

        twoGen.showTypes();

        System.out.println(twoGen.getInGen() + "\n"
            + twoGen.getStrGen());

    }

}
