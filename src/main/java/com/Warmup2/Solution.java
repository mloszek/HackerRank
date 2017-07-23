package com.Warmup2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Warmup: Plus-minus problem
 */
public class Solution {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        List<Integer> array = new ArrayList<>();
        int positives = 0;
        int negatives = 0;
        int zeroes = 0;

        int amount = scanner.nextInt();

        for (int i = 0; i < amount; i++) {
            array.add(scanner.nextInt());
        }

        if (amount <= 0)
            System.exit(0);

        for (Integer i: array) {
            if (i > 0)
                positives++;
            else if (i < 0)
                negatives++;
            else
                zeroes++;
        }

        System.out.format("%.6f", (double) positives / amount);
        System.out.println();
        System.out.format("%.6f", (double) negatives / amount);
        System.out.println();
        System.out.format("%.6f", (double) zeroes / amount);

    }
}
