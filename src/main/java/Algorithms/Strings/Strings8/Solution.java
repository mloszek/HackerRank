package Algorithms.Strings.Strings8;

import java.util.*;

/**
 * Strings: Weighted Uniform Strings
 */
    public class Solution {

        static Map<Character, Integer> letterMap = createLetterMap();
        static Scanner in = new Scanner(System.in);
        static List<Integer> queries = new ArrayList<>();

        public static void main(String[] args) {

            String s = in.next();
            int n = in.nextInt();

            for(int a0 = 0; a0 < n; a0++) {
                queries.add(in.nextInt());
            }

            checkWeights(s);
        }

        static void checkWeights(String string) {

            List<String> uniformStrings = splitToUniformStrings(string);
            List<Integer> integerValueOfUniforms = swapStringToInt(uniformStrings);

            for (Integer i: queries) {
                if (integerValueOfUniforms.contains(i))
                    System.out.println("Yes");
                else
                    System.out.println("No");
            }
        }

        static List<String> splitToUniformStrings(String string) {

            String[] splitted = string.split("");
            List<String> tempList = new ArrayList<>();
            String temp = "";

            for (int i = 0; i < splitted.length; i++) {
                if (temp == "") {
                    temp = splitted[i];
                    tempList.add(temp);
                } else {
                    if (String.valueOf(temp.charAt(temp.length() - 1)).equals(splitted[i])) {
                        temp += splitted[i];
                        tempList.add(temp);
                    } else {
                        temp = splitted[i];
                        tempList.add(temp);
                    }
                }
            }

            return tempList;
        }

        static List<Integer> swapStringToInt(List<String> list) {

            List<Integer> tempList = new ArrayList<>();

            for (int i = 0; i < list.size(); i++) {
                tempList.add(list.get(i).length() * letterMap.get(list.get(i).charAt(0)));
            }

            return tempList;
        }

        static Map<Character, Integer> createLetterMap() {

    //        List<Character> lowerCaseAlphabet = Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
    //                'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z');
            char[] lowerCaseAlphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
            Map<Character, Integer> tempMap = new HashMap<>();

            for (int i = 0; i < lowerCaseAlphabet.length; i++) {

                tempMap.put(lowerCaseAlphabet[i], i + 1);
            }

            return tempMap;
        }
    }
