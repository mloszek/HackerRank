package Algorithms.Strings.Strings6;

import java.util.Scanner;

/**
 * Strings: HackerRank in a String!
 */
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            doesContains(s);
        }
    }

    public static void doesContains(String string){

        char[] temp  = "hackerrank".toCharArray();
        int charIndex = 0;
        int stringIndex = 0;

        while (stringIndex < string.length()){

            if (string.charAt(stringIndex) == temp[charIndex]){
                charIndex++;
            }
            stringIndex++;

        }

    }
}