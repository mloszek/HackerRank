package Algorithms.Implementation.Implementation12;

import java.util.Scanner;

/**
 * Implementation: Drawing Book
 */
public class Solution {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numberOfPages = scanner.nextInt();
        int targetPage = scanner.nextInt();

        int minimalAmountOfTurns = pageTurns(numberOfPages, targetPage);
        System.out.println(minimalAmountOfTurns);

    }

    static int pageTurns(int numberOfPages, int targetPage) {

        int turnCounterForward = forwardTurning(targetPage);
        int turnCounterBackward = backwardTurning(numberOfPages, targetPage);

        return turnCounterBackward < turnCounterForward ? turnCounterBackward : turnCounterForward;
    }

    static int forwardTurning(int targetPage) {

        int turnsCount = 1;
        int currentPage = 2;

        if (targetPage == 1)
            return 0;

        while (true) {

            //in my opinion this code is more readable than if i put another fori loop inside of it
            if (currentPage == targetPage)
                break;

            currentPage++;

            if (currentPage == targetPage)
                break;

            currentPage++;
            turnsCount++;
        }

        return turnsCount;
    }

    static int backwardTurning(int numberOfPages, int targetPage) {

        int turnsCount = 0;
        int currentPage = numberOfPages;

        if (numberOfPages % 2 != 0) {

            if (targetPage == numberOfPages)
                return 0;

            while (true) {

                if (currentPage == targetPage)
                    break;

                currentPage--;

                if (currentPage == targetPage)
                    break;

                currentPage--;
                turnsCount++;
            }

        } else {

            if (targetPage == numberOfPages)
                return 0;

            while (true) {

                if (currentPage == targetPage)
                    break;

                currentPage--;
                turnsCount++;

                if (currentPage == targetPage)
                    break;

                currentPage--;

            }
        }

        return turnsCount;
    }
}
