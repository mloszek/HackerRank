package com.Warmup6;

import java.util.Scanner;

/**
 * Warmup: Time conversion
 */
public class Solution {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);

    }

    static String timeConversion(String s) {

        String[] splitted = s.split(":");

        if (splitted[2].length() < 4)
            return s;

        if ((Integer.parseInt(splitted[0]) < 12) &&
                (String.valueOf(splitted[2].charAt(splitted[2].length() - 2)).toLowerCase().equals("p")))
            splitted[0] = String.valueOf(Integer.parseInt(splitted[0]) + 12);
        if ((Integer.parseInt(splitted[0]) == 12) &&
                (String.valueOf(splitted[2].charAt(splitted[2].length() - 2)).toLowerCase().equals("a")))
            splitted[0] = "00";

        return splitted[0] + ":" + splitted[1] + ":"
                + String.valueOf(splitted[2].charAt(0)) + String.valueOf(splitted[2].charAt(1));
    }
}
