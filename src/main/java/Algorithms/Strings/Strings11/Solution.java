package Algorithms.Strings.Strings11;

import java.util.*;

/**
 * Strings: Gemstones
 */
public class Solution {

    static List<Set<Character>> elementsFromEachRock = new ArrayList<>();
    static List<Character> gemList = new ArrayList<>();
    static int result;
    static boolean contains;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        result = 0;
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            searchForGemstones(in.next());
        }
        
        createGemCatalog();

        for (int i = 0; i < gemList.size(); i++) {
            contains = true;
            for (int j = 0; j < elementsFromEachRock.size(); j++) {
                if (!elementsFromEachRock.get(j).contains(gemList.get(i))) {
                    contains = false;
                    break;
                }
            }
            if (contains)
                result++;
        }

        System.out.println(result);
    }
    
    static void createGemCatalog(){
        
        for (char c = 'a'; c <= 'z'; c++) {
            gemList.add(c);
        }
    }

    static void searchForGemstones(String s){

        Set<Character> gemstones = new HashSet<>();
        for (char c: s.toCharArray()) {
            gemstones.add(c);
        }
        elementsFromEachRock.add(gemstones);
    }
}
