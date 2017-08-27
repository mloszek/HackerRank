package Algorithms.Implementation.Implementation7;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Implementation: Divisible Sum Pairs
 */
public class Solution {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] ar = new int[n];

        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }

        int result = divisibleSumPairs(n, k, ar);
        System.out.println(result);
    }

    static int divisibleSumPairs(int n, int k, int[] ar) {

        int counter = 0;

        Arrays.sort(ar);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if ((ar[i] + ar[j]) % k == 0){
                    counter++;
                }
            }
        }
        return counter;
    }
}