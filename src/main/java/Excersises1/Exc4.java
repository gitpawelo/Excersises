package Excersises1;
/*
2.b Napisz program, w którym dokonasz konwersji wszystkich typów prostych na typy osłonowe i odwrotnie. Wypisz pary (prosty, osłonowy)
 */
public class Exc4 {
    public static void main(String [] args){

        Byte varByte = Byte.valueOf("-128");
        Short varShort = Short.valueOf("30001");
        Integer varInteger = Integer.valueOf("1234567");
        Float varFloat = Float.valueOf("123.123F");
        Double varDouble = Double.valueOf("123.12345");
        Long varLong = Long.valueOf("12345678912345");

        String stringDouble = Double.toString(varDouble);
        String stringLong = Long.toString(varLong);

        System.out.println("Byte: " + varByte + "\n" +
                "Short: " + varShort + "\n" +
                "Integer: " + varInteger + "\n" +
                "Double: " + varDouble + "\n" +
                "Float: " + varFloat + "\n" +
                "Long: " + varLong + "\n" +
                "StringDouble: " + stringDouble + "\n" +
                "StringLong: " + stringLong);
    }

}
