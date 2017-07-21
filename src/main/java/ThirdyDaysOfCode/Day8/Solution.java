package ThirdyDaysOfCode.Day8;

import java.util.*;

/**
 * Day 8 of 30 days challenge
 */
public class Solution {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i = 0; i < n; i++){
            String name = scanner.next();
            int phone = scanner.nextInt();
            map.put(name, phone);
        }
        while(scanner.hasNext()){
            String s = scanner.next();
            if (!map.containsKey(s)){
                System.out.println("Not found");
            }else
                System.out.println(s + "=" + map.get(s));
        }
        scanner.close();
    }
}