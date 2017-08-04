package Algorithms.Sorting.Sorting1;

import java.util.*;

/**
 * Sorting: Big Sorting
 */
public class Solution {
    public static void main(String[] args) throws InterruptedException {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String temp = null;
        List<String> smaller = new ArrayList<>();
        List<String> bigger = new ArrayList<>();

        String[] tab = new String[n];

        for (int i = 0; i < n; i++) {
            tab[i] = in.next();
        }

//        for (String s : tab) {
//            if (s.length() > 100)
//                bigger.add(s);
//            else
//                smaller.add(s);
//        }
//
//
//        QuicksortThread quicksortThread1 = new QuicksortThread(bigger);
//        QuicksortThread quicksortThread2 = new QuicksortThread(smaller);
//
//        quicksortThread1.start();
//        quicksortThread2.start();
//
//        quicksortThread1.join();
//        quicksortThread2.join();
//
//        quicksortThread2.getTab().stream().forEach(System.out::println);

        Comparator<String> isBigger = (a, b) -> {

            if (a.length() > b.length())
                return 1;
            else if (a.length() < b.length())
                return -1;
            else {
                for (int i = 0; i < a.length(); i++) {
                    if (Integer.parseInt(String.valueOf(a.charAt(i))) < Integer.parseInt(String.valueOf(b.charAt(i)))) {
                        return -1;
                    }
                }
            }
            return 0;
        };

        Arrays.stream(tab)
                .sorted(isBigger)
                .forEach(System.out::println);

    }
}
