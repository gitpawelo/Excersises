package Excersises1;

/*
2.a Napisz program, w którym zadeklarujesz zmienne wszystkich typów prostych, ale nie przypisuj im wartości jako stałej,
ale wynik jakiegoś wyrażenia. Wypisz te zmienne w konsoli.
 */
public class Exc3 {

    public static void main(String[] args) {

        byte varByte;
        short varShort;
        int varInt;
        double varDouble;
        float varFloat;

        varByte = 100 + 27;
        varShort = (short) (30000 + varByte);
        varInt = varByte + varShort;
        varFloat = varInt + varShort;
        varDouble = varFloat + varInt;

        System.out.println("Byte: " + varByte + "\n" +
                "Short: " + varShort + "\n" +
                "Integer: " + varInt + "\n" +
                "Double: " + varDouble + "\n" +
                "Float: " + varFloat);
    }

}
