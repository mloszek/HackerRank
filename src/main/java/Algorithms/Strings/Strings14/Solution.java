package Algorithms.Strings.Strings14;

import java.util.*;

/**
 * Strings: The Love-Letter Mystery
 */
public class Solution {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int result = theLoveLetterMystery(s);
            System.out.println(result);
        }
    }

    static int theLoveLetterMystery(String s){

        if (isPalindrome(s))
            return 0;

        int result = 0;
        char[] array = s.toCharArray();
        String backToString;

        do {
            for (int i = 0; i < array.length / 2; i++) {

                char firstLetter = array[i];
                char nextLetter = array[array.length - 1 - i];

                if (firstLetter != nextLetter){
                    if (firstLetter > nextLetter){
                        result += firstLetter - nextLetter;
                        array[i] = array[array.length - 1 - i];
                        break;
                    } else {
                        result += nextLetter - firstLetter;
                        array[array.length - 1 - i] = array[i];
                        break;
                    }
                }
            }

            backToString = new String(array);
        } while (!isPalindrome(backToString));

        return result;
    }

    static boolean isPalindrome(String s){

        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i))
                return false;
        }
        return true;
    }
}