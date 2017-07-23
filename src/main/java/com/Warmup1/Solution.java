package com.Warmup1;

import java.util.Scanner;

/**
 * Warmup: Diagonal Difference
 */
public class Solution {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();

        int[][] list = new int[row][row];

        for(int i = 0; i < row; i++){
            for(int j = 0; j < row; j++) {
                list[i][j] = scanner.nextInt();
            }
        }

        int dg1 = 0;
        int dg2 = 0;
        for (int i = 0; i < list.length; i++) {
            dg1 += list[i][i];
            dg2 += list[i][list.length - 1 - i];
        }

        System.out.println(Math.abs(dg1 - dg2));

    }
}
