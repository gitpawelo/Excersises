package Building.Model;


import lombok.Data;

@Data

public class Skycrapper extends Building {

    public Skycrapper(double height, double width, double length, int numberOfFloors) throws ArithmeticException {
        super(height, width, length, numberOfFloors);
    }

    @Override
    public double area(){
        System.out.print("Powierzchnia m2 wieżowca wynosi: ");
        return super.area();
    }
}
