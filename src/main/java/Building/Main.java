package Building;

import Building.Model.Apartment;
import Building.Model.Skycrapper;

public class Main {

    public static void main(String[] args) throws ArithmeticException {

        try {
            Apartment apartment = new Apartment(10.0, 0, 10.0, 2);
            apartment.area();
            Skycrapper skycrapper = new Skycrapper(50, 30, 40, 20);
            skycrapper.area();

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }


    }

}
