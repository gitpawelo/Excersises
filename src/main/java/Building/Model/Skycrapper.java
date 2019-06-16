package Building.Model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data

public class Skycrapper extends Building {

    private int numberOfFloors;
    private static final int PARTER = 1;

    public Skycrapper(double height, double width, double length, int numberOfFloors) {
        super(height, width, length);
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public double area() {
        System.out.print("Powierzchnia m2 wieżowca wynosi: ");
        return super.area() * (numberOfFloors + PARTER);
    }
}
