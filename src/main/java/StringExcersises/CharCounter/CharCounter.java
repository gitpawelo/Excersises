package StringExcersises.CharCounter;

/*
Napisz metodę (w klasie CharCounter), liczącą liczbę wystąpienia znaku w tekście. Np. dla napisu "ala ma kota kot ma mleko"
i literki "a" metoda zwróci wartość 5. Tip: możesz spróbować zrealizować zadanie używając metod contains, substring i indexOf klasy String.
 */

public class CharCounter {

    public void charCounter(String sentence){

        sentence = "ala ma kota kot ma mleko";

        int[] count = new int[255];

        int length = sentence.length();

        for (int i = 0; i < length; i++) {
            count[sentence.charAt(i)]++;
        }

        char[] ch = new char[sentence.length()];
        for (int i = 0; i < length; i++) {
            ch[i] = sentence.charAt(i);
            int find = 0;
            for (int j = 0; j <= i; j++) {
                if (sentence.charAt(i) == ch[j])
                    find++;
            }

            if (find == 1) {
                System.out.println("Number of Occurrence of " + sentence.charAt(i) + " letter is:" + count[sentence.charAt(i)]);
            }
        }

    }

}
