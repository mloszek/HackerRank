package Algorithms.Strings.Strings1;

import java.util.Scanner;

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

    static String super_reduced_string(String s){

        char temp = 'e';

        for (int i = 0; i < s.length(); i++) {

            if (i == 0)
            temp = s.charAt(i);
            else {
                if (s.charAt(i) == temp){

                }
            }

        }

        return null;
    }
}
