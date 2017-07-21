package ThirdyDaysOfCode.Day8;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Day 8 of 30 days challenge
 */
public class Solution {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            map.put(name, phone);
        }
        while(in.hasNext()){
            String s = in.next();
            if (!map.containsKey(s)){
                System.out.println("Not found");
            }else
            map.get(s);
        }
        in.close();


    }
}
