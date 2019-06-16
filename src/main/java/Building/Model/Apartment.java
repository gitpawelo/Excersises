package Building.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data

public class Apartment extends Building{

    private static final int PARTER = 1;
    private static final int FIRST_FLOOR = 1;

    public Apartment(double height, double width, double length) {
        super(height, width, length);
    }

    @Override
    public double area() {
        System.out.print("Powierzchnia m2 budynku jednorodzinnego wynosi: ");

        return super.area() * (PARTER+FIRST_FLOOR);
    }
}
