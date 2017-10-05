package Algorithms.Strings.Strings15;

import com.sun.deploy.util.StringUtils;

import java.util.*;

/**
 * Strings: Determining DNA Health
 */
public class Solution {

    private static List<Integer> results;
    private static List<String> geneList;
    private static List<Integer> healthList;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        results = new ArrayList<>();
        geneList = new ArrayList<>();
        healthList = new ArrayList<>();

        for (int genes_i = 0; genes_i < n; genes_i++) {
            geneList.add(in.next());
        }

        for (int health_i = 0; health_i < n; health_i++) {
            healthList.add(in.nextInt());
        }

        int s = in.nextInt();

        for (int a0 = 0; a0 < s; a0++) {
            int first = in.nextInt();
            int last = in.nextInt();
            String d = in.next();
            defineHealthiness(first, last, d);
        }

        Collections.sort(results);

        System.out.println(results.get(0) + " " + results.get(results.size() - 1));
    }

    private static void defineHealthiness(int first, int last, String d) {

        int result = 0;

        for (int i = first; i <= last; i++) {
            if (geneList.get(i).length() == 1) {
                for (int j = 0; j < d.length(); j++) {
                    if (geneList.get(i).equals(String.valueOf(d.charAt(j)))) {
                        result += healthList.get(i);
                    }
                }
            } else {
                String temp = d;
                int index = temp.indexOf(geneList.get(i));
                int count = 0;
                while (index != -1) {
                    count++;
                    temp = temp.substring(index + 1);
                    index = temp.indexOf(geneList.get(i));
                }
                result += count * healthList.get(i);
            }
        }

        results.add(result);
    }
}