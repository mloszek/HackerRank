package Algorithms.Strings.Strings7;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Strings: Pangrams
 */
public class Solution {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();

        System.out.println(isPanagram(sentence));

    }

    public static String isPanagram(String sentence) {

        List<Character> lowerCaseAlphabet = Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
                'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', ' ');

        List<Character> upperCaseAlphabet = Arrays.asList('A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K',
                'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', ' ');

        for ( int i = 0; i < lowerCaseAlphabet.size(); i++){

            if (!sentence.contains(String.valueOf(lowerCaseAlphabet.get(i)))
                    && !sentence.contains(String.valueOf(upperCaseAlphabet.get(i)))) {
                return "not pangram";
            }
        }

        return "pangram";
    }
}