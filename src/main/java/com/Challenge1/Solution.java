package com.Challenge1;

import java.util.Scanner;

/**
 * Created by milosz on 7/14/17.
 */
public class Solution {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        scanner.nextLine();

        String line1 = scanner.nextLine();
        String line2 = scanner.nextLine();
        String line3 = scanner.nextLine();
        String input = line1.concat(" ").concat(line2).concat(" ").concat(line3);
        String[] splitted = input.split(" ");

        int[][] list = new int[row][row];

        int splittedIndex = 0;

        for(int i = 0; i < row; i++){
            for(int j = 0; j < row; j++) {
                list[i][j] = Integer.parseInt(splitted[splittedIndex]);
                splittedIndex++;
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
