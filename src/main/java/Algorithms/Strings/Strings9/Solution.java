package Algorithms.Strings.Strings9;

import java.util.Scanner;

/**
 * Strings: Separate the Numbers
 */
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfQueries = in.nextInt();
        for(int i = 0; i < numberOfQueries; i++){
            isStringBeautiful(in.next());
        }
    }

    public static void isStringBeautiful(String s){

        boolean isBeautiful = false;

            Long temp = (long) 0;
            for (int j = 1; j <= s.length() / 2; j++) {
                Long valueOfSubstring = Long.valueOf(s.substring(0, j));
                temp = valueOfSubstring;
                String expectedString = s.substring(0, j);
                while (expectedString.length() < s.length()){
                    valueOfSubstring += 1;
                    expectedString += String.valueOf(valueOfSubstring);
                }

                if (expectedString.equals(s)){
                    isBeautiful = true;
                    break;
                }
            }

        System.out.println(isBeautiful ? "YES " + temp : "NO");
    }
}
