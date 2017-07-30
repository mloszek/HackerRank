package Algorithms.Implementation.Implementation2;

import java.util.Scanner;

/**
 * Implementation: Apple and Orange
 */
public class Solution {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int appleCounter = 0;
        int orangeCounter = 0;

        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();

        int[] apple = new int[m];

        for (int i = 0; i < m; i++) {
            apple[i] = in.nextInt();
            if (apple[i] + a >= s && apple[i] + a <= t)
                appleCounter++;
        }

        int[] orange = new int[n];

        for (int i = 0; i < n; i++) {
            orange[i] = in.nextInt();
            if (orange[i] + b <= t && orange[i] + b >= s)
                orangeCounter++;
        }

        System.out.println(appleCounter);
        System.out.println(orangeCounter);

    }
}
