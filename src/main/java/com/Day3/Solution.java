package com.Day3;

import java.util.Scanner;

/**
 * Day 3 of 30 days challenge
 */
public class Solution {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        String ans = "";


        if (n % 2 == 1) {
            ans = "Weird";
        } else if (n % 2 == 0 && n >= 2 && n <= 5) {
            ans = "Not Weird";
        } else if (n % 2 == 0 && n >= 6 && n <= 20) {
            ans = "Weird";
        } else if (n % 2 == 0 && n > 20) {
            ans = "Not Weird";
        }

        System.out.println(ans);

    }
}
