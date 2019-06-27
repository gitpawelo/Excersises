package Generics.Excersise4;

import Generics.Excersise4.BoundedGenerics.BoundedGenerics;

public class Main {
    public static void main(String[] args){

        BoundedGenerics<Double> numGen1 = new BoundedGenerics<Double>(5.0);
        BoundedGenerics<Double> numGen2 = new BoundedGenerics<Double>(5.25);

        System.out.println("Odwrotność liczby: " + numGen1.getNumber() + " to " + numGen1.reciprocal());
        System.out.println("Część dziesiętna liczby: " + numGen2.getNumber() + " to " + numGen2.fraction());


    }


}
