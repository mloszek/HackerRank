package Algorithms.DynamicProgramming.DynamicProgramming7;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Dynamic Programming: Fibonacci Modified
 */
public class Solution {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        BigInteger t1 = BigInteger.valueOf(scanner.nextInt());
        BigInteger t2 = BigInteger.valueOf(scanner.nextInt());
        int n = scanner.nextInt();

        System.out.println(findingNthElement(t1, t2, n));
    }

    public static BigInteger findingNthElement (BigInteger t1,BigInteger t2,int n){

        BigInteger result = null;

        for (int i = 3; i <= n; i++) {
            BigInteger powerT2 = t2.multiply(t2);
            result = t1.add(powerT2);
            t1 = t2;
            t2 = result;
        }

        return result;

    }
}