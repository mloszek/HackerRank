package Algorithms.Sorting.Sorting2;

import java.util.Scanner;

/**
 * Sorting: Intro to Tutorial Challenges
 */
public class Solution {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int searchedNumber = scanner.nextInt();
        int lengthOfArray = scanner.nextInt();
        int[] tab = new int[lengthOfArray];
        for (int i = 0; i < lengthOfArray; i++) {
            tab[i] = scanner.nextInt();
            if (tab[i] == searchedNumber)
                System.out.println(i);
        }
    }
}