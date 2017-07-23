package ThirdyDaysOfCode.Day9;

import java.util.Scanner;

/**
 * Day 9 of 30 days challenge
 */
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int result = factorial(n);
        System.out.println(result);
    }

    static int factorial(int n) {

        if (n == 1 || n == 0)
            return 1;
        else if (n < 0)
            return 0;

        return n * factorial(n - 1);
    }
}
