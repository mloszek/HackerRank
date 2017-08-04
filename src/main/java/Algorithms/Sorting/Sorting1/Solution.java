package Algorithms.Sorting.Sorting1;

import java.util.*;

/**
 * Sorting: Big Sorting
 */
public class Solution {
    public static void main(String[] args) throws InterruptedException {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        String[] tab = new String[n];

        for (int i = 0; i < n; i++) {
            tab[i] = in.next();
        }

        Comparator<String> isBigger = (a, b) -> {


            if (a.length() > 18 || b.length() > 18) {

                char[] charA = a.toCharArray();
                char[] charB = b.toCharArray();

                if (charA.length > charB.length)
                    return 1;
                else if (charA.length < charB.length)
                    return -1;
                else {
                    for (int i = 0; i < charA.length; i++) {

                        int A = Integer.parseInt(String.valueOf(charA[i]));
                        int B = Integer.parseInt(String.valueOf(charB[i]));

                        if (A > B)
                            return 1;
                        else if (A < B)
                            return -1;
                    }
                    return 0;
                }

            } else {

                long longA = Long.parseLong(a);
                long longB = Long.parseLong(b);

                if (longA - longB == 0)
                    return 0;
                else if (longA - longB > 0)
                    return 1;
                else
                    return -1;

            }
        };

        Arrays.stream(tab)
                .sorted(isBigger)
                .forEach(System.out::println);

    }
}
