package Excersises1;

import Methods.Methods5;

/*
3. Napisz program, w którym dodasz funkcję (metodę) realizującą dodawanie, odejmowanie, mnożenie i dzielenie, a także modulo na typie całkowitym int
 */
public class Main5 {
    public static void main(String[] args) {

        Methods5 methodsExc5 = new Methods5();

        methodsExc5.add(10, 2);
        methodsExc5.substract(10, 2);
        methodsExc5.multiply(10, 2);
        methodsExc5.divide(10, 2);
        methodsExc5.divide2(10, 0);
        methodsExc5.modulo(10, 3);

    }

}
