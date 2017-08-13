package ThirdyDaysOfCode.Day26;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Day 26 of 30 days challenge
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

        System.out.println(howMuch(returnDate, expectedDate));
    }

    public static int howMuch(int[] a, int[] b) {

        int hackos = 0;
        int aDays = dayCounter(a);
        int bDays = dayCounter(b);
        int odds = aDays - bDays;

        if (odds > 0 && a[1] == b[1] && a[2] == b[2])
            hackos = 15 * odds;
        else if (odds > 0 && a[1] > b[1] && a[2] == b[2])
            hackos = 500 * (a[1] - b[1]);
        else if (odds > 0 && a[2] > b[2])
            hackos = 10000;

        return hackos;
    }

    public static int dayCounter(int[] a) {

        int daysFromYears = 365 * a[2];
        int daysFromMonths = daysFromMonthsCounter(a[1]);
        int days = a[0];

        return daysFromYears + daysFromMonths + days;
    }

    public static int daysFromMonthsCounter(int a) {

        int dayCounter = 0;

        if (a <= 7) {
            for (int i = 1; i <= 7; i++) {
                if (i % 2 == 0)
                    dayCounter += 30;
                else
                    dayCounter += 31;
            }
        } else {
            dayCounter += 214;
            for (int i = 2; i <= 6; i++) {
                if (i % 2 == 0)
                    dayCounter += 31;
                else
                    dayCounter += 30;
            }
        }

        return dayCounter;
    }
}
