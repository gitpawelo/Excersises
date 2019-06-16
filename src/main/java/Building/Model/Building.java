package Building.Model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Building {

    private double height;
    private double width;
    private double length;

    public double area(){
        System.out.println(width*length);
        return width * length;
    }
}
