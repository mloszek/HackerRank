package Algorithms.Strings.Strings8;

import java.util.*;

/**
 * Strings: Weighted Uniform Strings
 */
public class Solution {

    static List<Integer> integerValueOfUniforms = new ArrayList<>();
    static StringBuilder temp = new StringBuilder();

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
            if (temp.length() == 0) {
                wordCare(splitted[i]);
            } else {
                if (temp.charAt(temp.length() - 1) == splitted[i]) {
                    wordCare(splitted[i]);
                } else {
                    temp.setLength(0);
                    wordCare(splitted[i]);
                }
            }
        }
    }

    static void wordCare (char a){

        temp.append(a);
        integerValueOfUniforms.add(swapStringToInt(temp));
    }

    static Integer swapStringToInt(StringBuilder word) {

        return word.length() * (word.charAt(0) - 96);
    }
}
