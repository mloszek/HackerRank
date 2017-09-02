package Algorithms.Strings.Strings4;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Strings: Caesar Cipher
 */
public class Solution {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int lengthOfString = scanner.nextInt();
        String unencryptedString = scanner.next();
        int key = scanner.nextInt();

        String encryptedString = doEncrypt(unencryptedString, key);

        System.out.println(encryptedString);
    }

    static String doEncrypt(String message, int key) {

        List<Character> splittedMessage = doSplit(message);
        doSwap(splittedMessage, key);

        return rejoinCharsToString(splittedMessage);
    }

    static List<Character> doSplit(String s){

        return Stream.of(s.split(""))
                .map(letter -> letter.charAt(0))
                .collect(Collectors.toList());
    }

    static List<Character> doSwap(List<Character> splittedMessage, int key){

        List<Character> upperCaseLetters = Arrays.asList('A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K',
                'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z');
        List<Character> lowerCaseLetters = Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
                'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z');

        for (int i = 0; i < splittedMessage.size(); i++) {
            if (upperCaseLetters.contains(splittedMessage.get(i)))
                splittedMessage.set(i, swappedCharacter(upperCaseLetters, splittedMessage.get(i), key));
            else if (lowerCaseLetters.contains(splittedMessage.get(i)))
                splittedMessage.set(i, swappedCharacter(lowerCaseLetters, splittedMessage.get(i), key));
        }

        return splittedMessage;
    }

    static Character swappedCharacter(List<Character> letters, char inputChar, int key){

        int index = letters.indexOf(inputChar);
        int i = 0;

        while (i < key){
            index++;
            if (index == letters.size())
                index = 0;
            i++;
        }

        return letters.get(index);
    }

    static String rejoinCharsToString(List<Character> chars){

        String result = "";

        for (char c: chars) {
            result += (String.valueOf(c));
        }

        return result;
    }
}
