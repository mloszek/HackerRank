package ThirdyDaysOfCode.Day14;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {

    private int[] elements;

    public void setMaximumDifference(int maximumDifference) {
        this.maximumDifference = maximumDifference;
    }

    public int maximumDifference;

    public Difference(int[] elements) {
        this.elements = elements;
    }

    public void computeDifference(){

        int difference = 0;

        for (int i = 0; i < elements.length; i++) {
            for (int j = 0; j < elements.length; j++) {
                int temp = Math.abs(elements[i] - elements[j]);
                if (temp > difference)
                    difference = temp;
            }
        }

        setMaximumDifference(difference);

    }
}