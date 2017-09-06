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

        for(int a0 = 0; a0 < n; a0++) {
            queries.add(in.nextInt());
        }

        checkWeights(s);
    }

    static void checkWeights(String string) {

        List<String> uniformStrings = splitToUniformStrings(string);
        List<Integer> integerValueOfUniforms = swapStringToInt(uniformStrings);

        for (Integer i: queries) {
            if (integerValueOfUniforms.contains(i))
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }

    static List<String> splitToUniformStrings(String string) {

        List<String> tempList = new ArrayList<>();
        String temp = "";

        for (int i = 0; i < string.length(); i++) {
            if (temp == "") {
                temp += String.valueOf(string.charAt(i));
                tempList.add(temp);
            } else {
                if (temp.charAt(temp.length() - 1) == string.charAt(i)) {
                    temp += String.valueOf(string.charAt(i));
                    tempList.add(temp);
                } else {
                    temp = String.valueOf(string.charAt(i));
                    tempList.add(temp);
                }
            }
        }

        return tempList;
    }

    static List<Integer> swapStringToInt(List<String> list) {

        List<Integer> tempList = new ArrayList<>();
        int temp = 0;

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.get(i).length(); j++) {
                temp += letterMap.get(list.get(i).charAt(j));
            }
            tempList.add(temp);
            temp = 0;
        }

        return tempList;
    }

    static Map<Character, Integer> createLetterMap() {

        List<Character> lowerCaseAlphabet = Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
                'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z');
        Map<Character, Integer> tempMap = new HashMap<>();

        for (int i = 0; i < lowerCaseAlphabet.size(); i++) {

            tempMap.put(lowerCaseAlphabet.get(i), i + 1);
        }

        return tempMap;
    }
}
