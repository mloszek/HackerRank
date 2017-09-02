package Algorithms.Implementation.Implementation22;

import java.util.Scanner;

/**
 * Implementation: Angry Professor
 */
public class Solution {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numberOfTestCases = scanner.nextInt();

        for (int i = 0; i < numberOfTestCases; i++) {

            int numberOfStudents = scanner.nextInt();
            int cancelationThreshold = scanner.nextInt();
            int[] students = new int[numberOfStudents];

            for (int j = 0; j < numberOfStudents; j++) {
                students[j] = scanner.nextInt();
            }

            isClassCancelled(students, cancelationThreshold);
        }

    }

    static void isClassCancelled(int [] students, int threshold){

        int numberOfPresentStudents = 0;

        for (int i = 0; i < students.length; i++) {
            if (students[i] <= 0)
                numberOfPresentStudents++;
        }

        String result = numberOfPresentStudents >= threshold ? "NO" : "YES" ;

        System.out.println(result);
    }
}
