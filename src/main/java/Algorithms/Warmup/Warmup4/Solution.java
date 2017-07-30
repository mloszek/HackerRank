package Algorithms.Warmup.Warmup4;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Warmup: Mini-Max Sum
 */
public class Solution {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        BigInteger[] arr = new BigInteger[5];
        List<BigInteger> results = new ArrayList<>();
        BigInteger sum;

        String input = in.nextLine();
        String[] splitted = input.split(" ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new BigInteger(splitted[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            sum = new BigInteger("0");
            for (int j = 0; j < arr.length; j++) {
                if (j != i)
                    sum = sum.add(arr[j]);
            }
            results.add(sum);
        }

        Collections.sort(results);
        System.out.println(results.get(0) + " " + results.get(results.size() - 1));

    }
}
