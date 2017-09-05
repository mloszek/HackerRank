package Algorithms.Strings.Strings6;

import java.util.Scanner;

/**
 * Strings: HackerRank in a String!
 */
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            doesContains(s);
        }
    }

    public static void doesContains(String string){

        char[] temp  = "hackerrank".toCharArray();
        char[] letters = string.toCharArray();
        int tempIndex = 0;
        int stringIndex = 0;

        for (int i = 0; i < string.length(); i++) {
            if (letters[i] == temp[tempIndex]){
                tempIndex++;
            }

            if (tempIndex == temp.length) {
                System.out.println("YES");
                break;
            }
        }

        if (tempIndex < temp.length) {
            System.out.println("NO");
        }
    }
}