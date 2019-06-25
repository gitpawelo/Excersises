package StringExcersises;

/*
Zmień napis: "    stado owiec jeździ rowerem   " na "STADO KRÓW JEŹDZI"
 */

public class Main2 {

    public static void main(String[] args) {

        String input = "    stado owiec jeździ rowerem   ";
        String result;

        result = input.replace("    stado owiec jeździ rowerem   ", "STADO KRÓW JEŹDZI");

        System.out.println(result);
    }

}
