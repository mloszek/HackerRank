package Algorithms.Strings.Strings8;

import java.util.*;

/**
 * Strings: Weighted Uniform Strings
 */
public class Solution {

    static Map<Character, Integer> letterMap = createLetterMap();
    static Scanner in = new Scanner(System.in);
    static List<Integer> integerValueOfUniforms = new ArrayList<>();

    public static void main(String[] args) {

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

        StringBuilder temp = new StringBuilder();

        for (int i = 0; i < string.length(); i++) {
            if (temp.length() == 0) {
                wordCare(temp, splitted[i]);
            } else {
                if (temp.charAt(temp.length() - 1) == splitted[i]) {
                    wordCare(temp, splitted[i]);
                } else {
                    temp.setLength(0);
                    wordCare(temp, splitted[i]);
                }
            }
        }
    }

    static void wordCare (StringBuilder temp, char a){

        temp.append(a);
        integerValueOfUniforms.add(swapStringToInt(temp));
    }

    static Integer swapStringToInt(StringBuilder word) {

        return word.length() * letterMap.get(word.charAt(0));
    }

    static Map<Character, Integer> createLetterMap() {

        char[] lowerCaseAlphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        Map<Character, Integer> tempMap = new HashMap<>();

        for (int i = 0; i < lowerCaseAlphabet.length; i++) {

            tempMap.put(lowerCaseAlphabet[i], i + 1);
        }

        return tempMap;
    }
}
