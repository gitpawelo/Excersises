package Generics.Excersise5;

import Generics.Excersise5.PairGen.PairGen;

public class Main {

    public static void main(String[] args) {

        PairGen<Integer, Integer> pairGen1 = new PairGen<>(12, 13);
        PairGen<Number, Integer> pairGen2 = new PairGen<>(12.0f, 13);
        PairGen<Number, Double> pairGen3 = new PairGen<>(12, 13.0);

        pairGen1.showTypes();
        pairGen2.showTypes();
        pairGen3.showTypes();

    }

}
