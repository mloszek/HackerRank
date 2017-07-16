package com.Day2;

import java.util.Scanner;

/**
 * Day 2 of 30 days challenge
 */
public class Solution {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble();
        int tipPercent = scan.nextInt();
        int taxPercent = scan.nextInt();
        scan.close();

        int totalCost = (int) Math.round(mealCost + (mealCost * ((double) tipPercent / 100)) + (mealCost * ((double) taxPercent / 100)));

        System.out.println("The total meal cost is " + totalCost + " dollars.");

    }
}
