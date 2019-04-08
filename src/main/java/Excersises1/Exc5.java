package Excersises1;
/*
3. Napisz program, w którym dodasz funkcję (metodę) realizującą dodawanie, odejmowanie, mnożenie i dzielenie, a także modulo na typie całkowitym int
 */
public class Exc5 {
    public static void main(String[] args) {

        Methods methods = new Methods();

        methods.add(10, 2);
        methods.substract(10, 2);
        methods.multiply(10, 2);
        methods.divide(10, 2);
        methods.divide2(10, 0);
        methods.modulo(10, 3);

    }

}
