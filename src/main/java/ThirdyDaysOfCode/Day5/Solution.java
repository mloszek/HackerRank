package ThirdyDaysOfCode.Day5;

import java.util.Scanner;

/**
 * Day 5 of 30 days challenge
 */
public class Solution {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 1; i <= 10 ; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }

    }
}
