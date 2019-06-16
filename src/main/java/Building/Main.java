package Building;

import Building.Model.Apartment;
import Building.Model.Building;
import Building.Model.Skycrapper;

public class Main {

    public static void main(String[] args) {

        Apartment apartment = new Apartment(10.0, 10.0, 10.0);
        apartment.area();



        Skycrapper skycrapper = new Skycrapper(50, 30, 40, 28);
        skycrapper.area();

    }

}
