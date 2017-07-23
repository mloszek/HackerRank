package ThirdyDaysOfCode.Day10;

import java.util.Scanner;

/**
 * Day 10 of 30 days challenge
 */
public class Solution {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        System.out.println(consecutive1sCounter(Integer.toBinaryString(number)));

    }

    public static int consecutive1sCounter(String string) {

        int count = 0;
        int temp = 0;

        for (int i = 0; i < string.length(); i++) {
            if (String.valueOf(string.charAt(i)).equals("1"))
                count++;
            else if (String.valueOf(string.charAt(i)).equals("0") && count > 0 && count > temp){
                temp = count;
                count = 0;
            }
            else if (String.valueOf(string.charAt(i)).equals("0") && count > 0 && count <= temp) {
                count = 0;
            }
        }

        if (count > temp)
            temp = count;

        return temp;
    }
}
