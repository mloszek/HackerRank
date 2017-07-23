package com.Warmup5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Warmup: Birthday Cake Candles
 */
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = birthdayCakeCandles(n, ar);
        System.out.println(result);
    }

    static int birthdayCakeCandles(int n, int[] ar) {

        List<Integer> top = new ArrayList<>();

        int temp = 0;

        for (int i = 0; i < ar.length; i++) {
            if (i == 0)
            temp = ar[i];
            else if (ar[i] > temp)
                temp = ar[i];
        }

        for (int i = 0; i < ar.length; i++) {
            if (ar[i] == temp)
                top.add(ar[i]);
        }

        return top.size();
    }
}
