package Algorithms.Strings.Strings10;

import java.util.Scanner;

/**
 * Strings: Funny String
 */
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int queries = in.nextInt();
        for (int i = 0; i < queries; i++) {
            funnyString(in.next());
        }
    }

    private static void funnyString(String s) {

        char[] letters = s.toCharArray();
        String result = "Funny";

        for (int i = 0; i < s.length() - 1; i++) {
            int a = Math.abs(letters[i + 1] - letters[i]);
            int b = Math.abs(letters[s.length() - 2 - i] - letters[s.length() - 1 - i]);
            if (a != b) {
                result = "Not Funny";
                break;
            }
        }

        System.out.println(result);
    }
}

