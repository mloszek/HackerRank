package Algorithms.Strings.Strings8;

import java.util.*;

/**
 * Strings: Weighted Uniform Strings
 */
public class Solution {

    static Set<Integer> integerValueOfUniforms = new HashSet<>();
    static StringBuilder stringBuilder = new StringBuilder();

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        splitToUniformStrings(in.next());
        int n = in.nextInt();

        for (int a0 = 0; a0 < n; a0++) {
            if (integerValueOfUniforms.contains(in.nextInt()))
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }

    static void splitToUniformStrings(String string) {

        char[] splitted = string.toCharArray();

        for (int i = 0; i < string.length(); i++) {
            if (stringBuilder.length() == 0) {
                wordCare(splitted[i]);
            } else {
                if (stringBuilder.charAt(stringBuilder.length() - 1) == splitted[i]) {
                    wordCare(splitted[i]);
                } else {
                    stringBuilder.setLength(0);
                    wordCare(splitted[i]);
                }
            }
        }
    }

    static void wordCare (char a){

        stringBuilder.append(a);
        integerValueOfUniforms.add(swapStringToInt(stringBuilder));
    }

    static Integer swapStringToInt(StringBuilder word) {

        return word.length() * (word.charAt(0) - 96);
    }
}
