package ThirdyDaysOfCode.Day6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Day 5 of 30 days challenge
 */
public class Solution {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<String> givenStrings = new ArrayList<>();
        int amount = scanner.nextInt();

        for (int i = 0; i < amount; i++) {
            givenStrings.add(scanner.next());
//            scanner.nextLine();
        }

//        String input = scanner.nextLine();
//
//        String[] splitted = input.split("\n");
//


        for (String s: givenStrings) {
            String even = "";
            String odd = "";
            char[] temp = s.toCharArray();
            for (int i = 0; i < temp.length; i++) {
                if (i % 2 == 0)
                    even += String.valueOf(temp[i]);
                else
                    odd += String.valueOf(temp[i]);
            }
            System.out.print(even + " ");
            System.out.println(odd);
        }

    }
}
