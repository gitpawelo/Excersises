package Lambdas.Exc1;
/*
Basic lambdas.
Make an array containing a few Strings. Sort it by
• length (i.e., shortest to longest)
(Hint: this exact solution was shown in the lecture)
• reverse length (i.e., longest to shortest)
(Hint: minor variation of the first bullet)
• alphabetically by the first character only
(Hint: charAt(0) returns the numeric code for the first character)
• Strings that contain “e” first, everything else second. For now, put the code directly in the lambda.
(Hint: remember that the body of a lambda is allowed to have curly braces and a return state-ment. See the first two lambda examples in the notes.)
• Redo the previous problem, but use a static helper method so that your lambda looks like this:
Arrays.sort(words, (s1,s2) -> Utils.yourMethod(s1,s2))
 */

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main1 {

    public static void main(String[] args) {

        List<String> arrayList = Arrays.asList("Janek", "Franek", "Zenek", "Zofia", "Krzysztof");

        Collections.sort(arrayList, (p1, p2) -> p1.length() - p2.length());
        printByCondition(arrayList, p -> true);
        Collections.sort(arrayList, (p1, p2) -> p2.length() - p1.length());
        printByCondition(arrayList, p-> true);
        Collections.sort(arrayList, (p1, p2)-> p1.compareTo(p2));
        printByCondition(arrayList, p -> true);

        printByCondition(arrayList, p ->p.startsWith("Z"));

    }

    public static void printByCondition(List<String> words, Condition condition){
        for (String result: words
        ) {
            if (condition.test(result)){
                System.out.println(result);
            }
        }
    }
}

interface Condition{
    boolean test(String condition);
}

