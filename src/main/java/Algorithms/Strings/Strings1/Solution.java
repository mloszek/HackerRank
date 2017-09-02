package Algorithms.Strings.Strings1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

/**
 * Strings: Super Reduced String
 */
public class Solution {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = super_reduced_string(s);

        System.out.println(result);
    }

    static String super_reduced_string(String s) {

        List<Character> letters = new ArrayList<>();
        for (char c: s.toCharArray()) {
            letters.add(c);
        }

        reduce(letters);

        return letters.size() > 0 ? rejoinCharsToString(letters) : "Empty String";
    }

    static List<Character> reduce(List<Character> chars){

        char temp = ' ';

        for (int i = 0; i < chars.size(); i++) {
            if (chars.get(i) != temp)
                temp = chars.get(i);
            else {
                chars.remove(i);
                chars.remove(i - 1);
                temp = ' ';
                i = -1;
            }
        }

        return chars;
    }

    static String rejoinCharsToString(List<Character> chars){

        String result = "";

        for (char c: chars) {
            result += (String.valueOf(c));
        }

        return result;
    }
}
