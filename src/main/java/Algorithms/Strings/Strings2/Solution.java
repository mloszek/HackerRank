package Algorithms.Strings.Strings2;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Strings: CamelCase
 */
public class Solution {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        
        int amountOfWords = wordCounter(s);

        System.out.println(amountOfWords);
    }
    
    static int wordCounter(String s){

        int counter = 1;

        List<Character> upperCaseLetters = Arrays.asList('A','B','C','D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 
                'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'W', 'V', 'X', 'Y', 'Z');

        for (char c: s.toCharArray()) {
            if (upperCaseLetters.contains(c))
                counter++;
        }
        
        return counter;
    }
}
