package Building.Model;

public class Apartment extends Building{

    private static final int PARTER = 1;
    private static final int FIRST_FLOOR = 1;

    @Override
    public double area() {
        return super.area() * (PARTER+FIRST_FLOOR);
    }
}
