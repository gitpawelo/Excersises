package Methods;

public class MethodsAdult {

    public void checkAdult(int age) {

        if (age < 18) {

            System.out.println("You are not adult my friend!");

        } else if (age > 18 && age < 100) {

            System.out.println("You are adult! Want some bear?");

        } else {

            System.out.println("You are over 100 years! Nice!");
        }


    }


}
