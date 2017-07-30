package Algorithms.Sorting.Sorting1;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Sorting: Big Sorting
 */
public class Solution {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String temp = null;

        List<String> list = new ArrayList<>();

        for(int i=0; i < n; i++){
            list.add(in.next());
        }

        Comparator<String> comparator = Comparator.comparing(Integer::valueOf);

        Collections.sort(list, comparator);

        System.out.println(String.valueOf(list));

    }

    public static boolean isBigger(String a, String b){

        for (int i = 0; i < a.length(); i++) {
            if (Integer.parseInt(String.valueOf(a.charAt(i))) > Integer.parseInt(String.valueOf(b.charAt(i)))){
                return true;
            }
        }

        return false;
    }
}