package Algorithms.Strings.Strings12;

import java.util.*;

/**
 * Strings: Alternating Characters
 */
public class Solution {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){

            String s = in.next();
            int result = alternatingCharacters(s);
            System.out.println(result);
        }
    }

    static int alternatingCharacters(String s){

        int result = 0;
        char letter = 'x';

        for (int i = 0; i < s.length(); i++) {
            if (i == 0)
                letter = s.charAt(0);
            else {
                if (s.charAt(i) == letter){
                    result++;
                } else {
                    letter = s.charAt(i);
                }
            }
        }

        return result;
    }
}
