package Methods;

public class Methods5 {

    public void add(int num1, int num2) {
        System.out.println("Wynik dodawania: " + (num1 + num2));
    }

    public void substract(int num1, int num2) {
        System.out.println("Wynik odejmowania: " + (num1 - num2));
    }

    public void multiply(int num1, int num2) {
        System.out.println("Wynik mnożenia: " + (num1 * num2));
    }

    public void divide(int num1, int num2) {
        if (num2 == 0) {
            System.out.println("Nie można dzielić przez zero!");
        } else {

            System.out.println("Wynik dzielenia: " + (num1 / num2));
        }
    }

    public void divide2(int num1, int num2) {
        try {
            System.out.println(num1 / num2);
        } catch (ArithmeticException e) {
            System.out.println("Nie można dzielić przez zero!");

        }
    }

    public void modulo(int num1, int num2) {
        System.out.println("Reszta z dzielenia: " + (num1 % num2));
    }



}
