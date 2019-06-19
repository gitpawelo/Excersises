package Building.Model;

import lombok.Data;

@Data

public class Apartment extends Building{


    public Apartment(double height, double width, double length, int numberOfFloors) throws ArithmeticException {
        super(height, width, length, numberOfFloors);
    }

    @Override
    public double area(){
        System.out.print("Powierzchnia m2 budynku jednorodzinnego wynosi: ");

        return super.area();
    }
}
