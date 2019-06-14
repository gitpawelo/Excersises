package Building.Model;

public class Skycrapper extends Building {

    private int numberOfFloors;
    private static final int PARTER = 1;

    @Override
    public double area() {
        return super.area() * (numberOfFloors + PARTER);
    }
}
