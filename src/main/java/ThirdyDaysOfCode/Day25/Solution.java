package ThirdyDaysOfCode.Day25;

import java.util.Scanner;

/**
 * Day 25 of 30 days challenge
 */
public class Solution {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int i = 0; i < T; i++) {
            isPrime(scanner.nextInt());
        }
    }

    public static void isPrime(int a) {

        if (a < 2)
            System.out.println("Not prime");
        else if (a == 2)
            System.out.println("Prime");
        else if (a == 3)
            System.out.println("Prime");
        else {
            for (int i = 2; i <= Math.sqrt(a); i++) {
                if (a % i == 0){
                    System.out.println("Not prime");
                    break;
                }
                if ((i > (Math.sqrt(a) - 1)) && (a % i != 0)) {
                    System.out.println("Prime");
                    break;
                }
                if ((i == Math.sqrt(a)) && (a % i != 0)) {
                    System.out.println("Prime");
                    break;
                }
            }
        }
    }
}