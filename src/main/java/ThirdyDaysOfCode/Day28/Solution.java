package ThirdyDaysOfCode.Day28;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Day 28 of 30 days challenge
 */
public class Solution {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        List<String> names = new ArrayList<>();
        for (int i = 0; i < rows; i++) {
            String name = scanner.next();
            String email = scanner.next();
            if (email.contains("@gmail.com"))
                names.add(name);

        }

        names.stream()
                .sorted()
                .forEach(System.out::println);
    }
}
