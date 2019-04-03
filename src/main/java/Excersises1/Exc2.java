package Excersises1;

import java.util.Random;

public class Exc2 {

    public static void main(String[] args) {

        int [] array = new int[10];

        Random random = new Random(20);
        for (int i = 0; i <10 ; i++) {

            array[i] = random.nextInt(50);
        }

        for (int resultArray: array
             ) {
            System.out.println(resultArray + " ");
        }

        for (int resultArray: array
                ) {
            System.out.print(resultArray + " " + "\t");
        }



    }

}
