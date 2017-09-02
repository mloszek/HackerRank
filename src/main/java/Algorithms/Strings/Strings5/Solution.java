package Algorithms.Strings.Strings5;

import java.util.Scanner;

/**
 * Strings: Mars Exploration
 */
public class Solution {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int lettersInterrupted = howManyLettersChanged(s);

        System.out.println(lettersInterrupted);
    }

    static int howManyLettersChanged(String signal) {

        int counter = 0;
        int index = 0;

        while (index != signal.length()) {

            if (signal.charAt(index) != 'S')
                counter++;

            index++;

            if (signal.charAt(index) != 'O')
                counter++;

            index++;

            if (signal.charAt(index) != 'S')
                counter++;

            index++;

        }

        return counter;
    }
}
