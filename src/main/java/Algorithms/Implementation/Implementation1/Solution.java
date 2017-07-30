package Algorithms.Implementation.Implementation1;

import java.util.Scanner;

/**
 * Implementation: Grading Students
 */
public class Solution {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print(solve(in.nextInt()) + (i != n - 1 ? "\n" : ""));
        }

    }

    static int solve(int grade) {

        if (grade >= 38) {
            int a = Integer.parseInt(String.valueOf(String.valueOf(grade).charAt(1)));
            if (a == 3)
                grade += 2;
            if (a == 4)
                grade += 1;
            if (a == 8)
                grade += 2;
            if (a == 9)
                grade += 1;

        }

        return grade;
    }
}
