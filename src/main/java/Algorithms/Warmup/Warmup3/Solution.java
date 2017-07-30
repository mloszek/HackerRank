package Algorithms.Warmup.Warmup3;


import java.util.Scanner;

/**
 * Warmup: Staircase
 */
public class Solution {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();

        for (int i = 1; i <= size; i++) {
            String line = "";
            for (int j = 0; j < size; j++) {
                if (j >= size - i)
                    line += "#";
                else
                    line += " ";
            }
            System.out.println(line);
        }



    }
}
