package ThirdyDaysOfCode.Day11;

import java.util.*;

/**
 * Day 11 of 30 days challenge
 */
public class Solution {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        List<Integer> results = new ArrayList<>();

        int sum = 0;

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        for (int h = 0; h < 4; h++) {
            sum = 0;
            for (int i = 0; i < 4; i++) {
                sum = 0;
                for (int j = i; j < 3 + i; j++) {
                    for (int k = h; k < 3 + h; k++) {
                        if (j > i && j < 2 + i) {
                            if (k > h && k < 2 + h)
                                sum += arr[j][k];
                        } else
                            sum += arr[j][k];
                    }
                }
                results.add(sum);
            }
            results.add(sum);
        }
        results.add(sum);

        results.sort(Integer::compareTo);
        System.out.println(results.get(results.size() - 1));

    }
}
