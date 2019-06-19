package Building.Model;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Building {

    private double height;
    private double width;
    private double length;
    private int numberOfFloors;

    public Building(double height, double width, double length, int numberOfFloors) throws ArithmeticException {

        if (width<=0 || length<=0){
                throw new ArithmeticException("Przynajmniej jedna z podanych wartości jest mniejsze równe 0. Nie można obliczyć powierzchni.");
        }

        this.height = height;
        this.width = width;
        this.length = length;
        this.numberOfFloors = numberOfFloors;
    }

    public double area(){

        System.out.println(width*length*(numberOfFloors+1));
        return width * length * (numberOfFloors+1);
    }
}
