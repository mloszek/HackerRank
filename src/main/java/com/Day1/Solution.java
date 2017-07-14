package com.Day1;

import java.util.Scanner;

/**
 * Day 1 of 30 days challenge
 */
public class Solution {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int i = 4;
        double d = 4.0;
        String s = "HackerRank";

        int myInteger = scanner.nextInt();
        double myDouble = scanner.nextDouble();
        scanner.nextLine();
        String myString = scanner.nextLine();

        System.out.println(i + myInteger);
        System.out.println(d + myDouble);
        System.out.println(s.concat(myString));

    }
}
