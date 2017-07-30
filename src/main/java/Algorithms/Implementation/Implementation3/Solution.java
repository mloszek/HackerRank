package Algorithms.Implementation.Implementation3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeoutException;

/**
 * Implementation: Kangaroo
 */
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        String result = kangaroo(x1, v1, x2, v2);

        System.out.println(result);

    }

    static String kangaroo(int x1, int v1, int x2, int v2) {

        List<Kangaroo> kangarooList = new ArrayList<>();
        kangarooList.add(new Kangaroo(x1, v1));
        kangarooList.add(new Kangaroo(x2, v2));


        if (isAlreadyWin(kangarooList)) {
            return "YES";
        }

        if (isAlreadyLoose(kangarooList)){
            return "NO";
        }

        kangarooList.sort(Comparator.comparingInt(Kangaroo::getVelocity));

        int firstKangPos = kangarooList.get(1).getPosition();
        int secKangPos = kangarooList.get(0).getPosition();

        while (true) {

            firstKangPos += kangarooList.get(1).getVelocity();

            secKangPos += kangarooList.get(0).getVelocity();

            if (firstKangPos == secKangPos)
                return "YES";

            if (firstKangPos > secKangPos)
                return "NO";
        }

    }

    public static boolean isAlreadyWin(List<Kangaroo> list) {

        List<Kangaroo> spec = list;


        if ((list.get(0).getPosition() == list.get(1).getPosition()) && (list.get(0).getVelocity() == list.get(1).getVelocity()))
            return true;

        return false;
    }

    public static boolean isAlreadyLoose(List<Kangaroo> list) {

        for (int i = 0; i < 1; i++) {
            if ((list.get(1 - i).getPosition() > list.get(0 + i).getPosition()) && (list.get(1 - i).getVelocity() > list.get(0 + i).getVelocity()))
                return true;
        }

        return false;
    }
}