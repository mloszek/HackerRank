package Algorithms.Implementation.Implementation5;

import java.util.Scanner;

/**
 * Implementation: Breaking the Records
 */
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];

        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }

        printRecordBreaks(s);
    }

    static void printRecordBreaks(int[] s){

        int high = 0, low = 0, highBreak = 0, lowBreak = 0;

        for (int i = 0; i < s.length; i++) {
            if (i == 0){
                high = s[i];
                low = s[i];
            }else {
                if (s[i] > high){
                    high = s[i];
                    highBreak++;
                } else if (s[i] < low){
                    low = s[i];
                    lowBreak++;
                }
            }
        }

        System.out.println(highBreak + " " + lowBreak);
    }
}