package Algorithms.Sorting.Sorting1;

import java.util.*;

/**
 * Sorting: Big Sorting
 */
public class Solution {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String temp = null;

        String[] tab = new String[n];

        for(int i=0; i < n; i++){
            tab[i] = in.next();
        }



//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n - 1; j++) {
//                if (isBigger(tab[j], tab[j + 1])) {
//                    temp = tab[j];
//                    tab[j] = tab[j + 1];
//                    tab[j + 1] = temp;
//                }
//            }
//        }

        quickSort(0, tab.length - 1, tab);

        for (String s: tab) {
            System.out.println(s);
        }

    }

    private static void quickSort(int x, int y, String[] table) {
        int i, j;
        String temp;
        String pivotValue = table[(x + y) / 2];
        i = x;
        j = y;
        do {
            while (isBigger(pivotValue, table[i])) {
                i++;
            }
            while (isBigger(table[j], pivotValue)) {
                j--;
            }
            if (i <= j) {
                temp = table[i];
                table[i] = table[j];
                table[j] = temp;

                i++;
                j--;
            }
        } while (i <= j);
        if (x < j)
            quickSort(x, j, table);
        if (i < y)
            quickSort(i, y, table);
    }

    public static boolean isBigger(String a, String b){

        if (a.length() > b.length())
            return true;
        else if (a.length() < b.length())
            return false;
        else {
            for (int i = 0; i < a.length(); i++) {
                if (Integer.parseInt(String.valueOf(a.charAt(i))) < Integer.parseInt(String.valueOf(b.charAt(i)))) {
                    return false;
                }
            }
        }

        return true;
    }
}