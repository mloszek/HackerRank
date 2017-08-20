package ThirdyDaysOfCode.Day29;

import java.util.*;

/**
 * Day 29 of 30 days challenge
 */
public class Solution {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        int T = scanner.nextInt();

        for (int i = 0; i < T; i++) {
            int N = scanner.nextInt();
            int K = scanner.nextInt();
            checkForMax(N, K);
        }

    }

    public static void checkForMax (int N, int K){

        int result = 0;

        for (int i = 1; i < N; i++) {
            for (int j = i + 1; j <= N; j++) {
                int temp = i & j;
                if (temp > result && temp < K)
                    result = temp;
            }
        }

        System.out.println(result);
    }
}
