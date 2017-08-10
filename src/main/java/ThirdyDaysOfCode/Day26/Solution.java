package ThirdyDaysOfCode.Day26;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Day 25 of 30 days challenge
 */
public class Solution {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] returnDate = new int[3];
        int[] expectedDate = new int[3];

        for (int i = 0; i < 3; i++) {
            returnDate[i] = scanner.nextInt();
        }

        for (int i = 0; i < 3; i++) {
            expectedDate[i] = scanner.nextInt();
        }

//        Arrays.stream(returnDate).forEach(System.out::println);
//        System.out.println();
//        Arrays.stream(expectedDate).forEach(System.out::println);

        System.out.println(howMuch(returnDate, expectedDate));

    }

    public static int howMuch (int[] a, int[] b){

        int hackos = 0;
        int aDays = dayCounter(a);
        int bDays = dayCounter(b);


        return hackos;
    }

    public static int dayCounter(int[] a){

        int daysFromYears = 365 * a[2];



    }
}
