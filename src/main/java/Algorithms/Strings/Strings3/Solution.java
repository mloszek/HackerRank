package Algorithms.Strings.Strings3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Strings: Two Characters
 */
public class Solution {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        String s = scanner.next();

        List<Character> allLetters = getAllLetters(s);
        int result = longestPossibleString(allLetters);

        System.out.println(result);
    }

    static int longestPossibleString(List<Character> letters){

        List<Character> possibleLetters = lettersUsed(letters);




    }

    static List<Character> lettersUsed(List<Character> letters){

        List<Character> result = new ArrayList<>();

        for (char c: letters) {
            if (!result.contains(c))
                result.add(c);
        }

        return result;
    }

    static List<Character> getAllLetters(String s){

        return Stream.of(s.split(""))
                .map(letter -> letter.charAt(0))
                .collect(Collectors.toList());
    }
}
