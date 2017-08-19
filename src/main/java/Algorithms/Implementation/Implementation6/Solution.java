package Algorithms.Implementation.Implementation6;

import java.util.Scanner;

/**
 * Implementation: Birthday Chocolate
 */
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];

        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }

        int d = in.nextInt();
        int m = in.nextInt();

        System.out.println(solve(n, s, d, m));
    }

    static int solve(int n, int[] s, int d, int m){

        int temp = 0;
        int counter = 0;

        for (int i = 0; i < n - m + 1; i++) {
            for (int j = 0; j < m; j++) {
                temp += s[i + j];
            }
            if (temp == d)
                counter++;
            temp = 0;
        }

        return counter;
    }
}