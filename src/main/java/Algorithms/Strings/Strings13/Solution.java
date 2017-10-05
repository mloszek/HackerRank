package Algorithms.Strings.Strings13;

import java.util.*;

/**
 * Strings: Beautiful Binary String
 */
public class Solution {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String B = in.next();
        int result = minSteps(n, B);
        System.out.println(result);
    }

    static int minSteps(int n, String B) {

        if (!B.contains("010")) {
            return 0;
        }

        int result = 0;
        char[] array = B.toCharArray();
        String backToString = "";

        do {
            for (int i = 0; i < n; i++) {
                if (array[i] == 48) {
                    if (i == n - 3 && array[i + 1] == 49 && array[i + 2] == 48) {
                        array[i + 1] = '0';
                        result++;
                        break;
                    } else if (i < n - 3){
                        if (array[i + 1] == 49 && array[i + 2] == 48 && array[i + 3] == 49) {
                            array[i + 2] = '1';
                            result++;
                            break;
                        } else if (array[i + 1] == 49 && array[i + 2] == 48 && array[i + 3] == 48) {
                            array[i + 1] = '0';
                            result++;
                            break;
                        }
                    }
                }
            }

            backToString = new String(array);

        } while (backToString.contains("010"));

        return result;
    }
}
