package Algorithms.Implementation.Implementation4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Implementation: Between two sets
 */
public class Solution {

    static int getTotalX(int[] a, int[] b){

        List<Integer> divisorsA = new ArrayList<>();
        List<Integer> result = new ArrayList<>();

        List<Integer> B = new ArrayList<>();

        for (Integer i: b) {
            B.add(i);
        }

        Collections.sort(B);
        int min = B.get(0);


        for (int i = 1; i <= min; i++) {
            for (int j = 0; j < a.length; j++) {
                if (i % a[j] != 0)
                    break;
                else if (i % a[j] == 0 && j == a.length - 1)
                    divisorsA.add(i);
            }
        }

        for (int i = 0; i < divisorsA.size(); i++) {
            for (int j = 0; j < B.size(); j++) {
                if (B.get(j) % divisorsA.get(i) != 0)
                    break;
                else if (B.get(j) % divisorsA.get(i) == 0 && j == B.size() - 1)
                    result.add(divisorsA.get(i));
            }
        }

        return result.size();
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];

        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }

        for(int b_i=0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
        }

        System.out.println(getTotalX(a, b));
    }
}
