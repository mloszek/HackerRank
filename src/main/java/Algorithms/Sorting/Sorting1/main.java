package Algorithms.Sorting.Sorting1;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Created by milosz on 7/30/17.
 */
public class main {
    public static void main(String[] args) {


        List<BigInteger> list = new ArrayList<>();

        BigInteger num1 = new BigInteger("1");
        BigInteger num2 = new BigInteger("14");
        BigInteger num3 = new BigInteger("5");
        BigInteger num4 = new BigInteger("2");
        BigInteger num5 = new BigInteger("999");
        BigInteger num6 = new BigInteger("6");
        BigInteger num7 = new BigInteger("0");

        list.add(num1);
        list.add(num2);
        list.add(num3);

        list.stream().sorted(Comparator.comparing(BigInteger::intValue)).forEach(System.out::println);
    }
}