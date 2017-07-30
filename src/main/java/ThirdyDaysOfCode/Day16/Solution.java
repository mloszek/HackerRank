package ThirdyDaysOfCode.Day16;

import java.util.Scanner;

/**
 * Day 16 of 30 days challenge
 */
public class Solution {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String s = in.next();

        try {
            System.out.println(Integer.parseInt(s));
        } catch (NumberFormatException e){
            System.err.println("Bad String");
        }
    }
}
