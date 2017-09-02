package Algorithms.Strings.Strings3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
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

     static int longestPossibleString(List<Character> letters) {

        List<Character> possibleLetters = lettersUsed(letters);

        if (possibleLetters.size() == 1 || letters.size() < 2)
            return 0;
        else if (possibleLetters.size() == 2)
            return lettersCleaner(letters, possibleLetters.get(0), possibleLetters.get(1));
        else 
            return lengthTester(possibleLetters, letters);
        
    }

     static int lengthTester(List<Character> possibleLetters, List<Character> allLetters) {

        int result = 0;

        for (int i = 0; i < possibleLetters.size() - 1; i++) {
            for (int j = i + 1; j < possibleLetters.size(); j++) {
                int temp = lettersCleaner(allLetters, possibleLetters.get(i), possibleLetters.get(j));
                if (temp > result)
                    result = temp;
            }
        }

        return result;
    }

     static int lettersCleaner(List<Character> allLetters, char a, char b) {

         List<Character> cleanedList = new ArrayList<>();

         for (int i = 0; i < allLetters.size(); i++) {
             if (allLetters.get(i) == a || allLetters.get(i) == b)
                 cleanedList.add(allLetters.get(i));
         }

        return doesAlternate(cleanedList) ? cleanedList.size() : 0 ;
    }

     static boolean doesAlternate(List<Character> cleanedLettersList) {

        char a = ' ';
        char b = ' ';

        for (int i = 0; i < cleanedLettersList.size(); i++) {
            if (i == 0)
                a = cleanedLettersList.get(i);
            else if (i == 1 && cleanedLettersList.get(i) == a)
                return false;
            else if (i == 1 && cleanedLettersList.get(i) != a)
                b = cleanedLettersList.get(i);
            else if (i % 2 == 0 && cleanedLettersList.get(i) != a)
                return false;
            else if (i % 2 != 0 && cleanedLettersList.get(i) != b)
                return false;
        }

        return true;
    }

     static List<Character> lettersUsed(List<Character> letters) {

        List<Character> result = new ArrayList<>();

        for (char c : letters) {
            if (!result.contains(c))
                result.add(c);
        }

        return result;
    }

     static List<Character> getAllLetters(String s) {

        return Stream.of(s.split(""))
                .map(letter -> letter.charAt(0))
                .collect(Collectors.toList());
    }
}
