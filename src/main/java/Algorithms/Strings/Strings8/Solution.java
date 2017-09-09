package Algorithms.Strings.Strings8;

import java.util.*;

/**
 * Strings: Weighted Uniform Strings
 */
public class Solution {

    static Map<Character, Integer> letterMap = createLetterMap();
    static Scanner in = new Scanner(System.in);
    static List<Integer> queries = new ArrayList<>();

    public static void main(String[] args) {

        String s = in.next();
        int n = in.nextInt();

        for (int a0 = 0; a0 < n; a0++) {
            queries.add(in.nextInt());
        }

        checkWeights(s);
    }

    static void checkWeights(String string) {

        List<Integer> integerValueOfUniforms = splitToUniformStrings(string);

        for (Integer i : queries) {
            if (integerValueOfUniforms.contains(i))
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }

    static List<Integer> splitToUniformStrings(String string) {

        String[] splitted = string.split("");
        List<Integer> tempList = new ArrayList<>();
        String temp = "";

        for (int i = 0; i < splitted.length; i++) {
            if (temp == "") {
                temp = splitted[i];
                tempList.add(swapStringToInt(temp));
            } else {
                if (temp.contains(splitted[i])) {
                    temp += splitted[i];
                    tempList.add(swapStringToInt(temp));
                } else {
                    temp = splitted[i];
                    tempList.add(swapStringToInt(temp));
                }
            }
        }

        return tempList;
    }

    static Integer swapStringToInt(String word) {

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
