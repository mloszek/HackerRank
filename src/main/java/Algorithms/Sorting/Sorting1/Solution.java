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

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (isBigger(tab[j], tab[j + 1])) {
                    temp = tab[j];
                    tab[j] = tab[j + 1];
                    tab[j + 1] = temp;
                }
            }
        }

        for (String s: tab) {
            System.out.println(s);
        }

    }

    public static boolean isBigger(String a, String b){

        if (a.length() > b.length())
            return true;
        else if (a.length() < b.length())
            return false;
        else {
            for (int i = 0; i < a.length(); i++) {
                if (Integer.parseInt(String.valueOf(a.charAt(i))) > Integer.parseInt(String.valueOf(b.charAt(i)))) {
                    return true;
                }
            }
        }

        return false;
    }
}