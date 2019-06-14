package com.company;

import java.util.ArrayList;
import java.util.Random;

public class ArrayListBig {
    public static void main(String[] args) {
        Random numberGenerator = new Random();
        Integer tmpInteger;

//   Create an ArrayList of Integers.
        ArrayList<Integer> displayArray = new ArrayList<Integer>();

        //   Fill up the list with one thousand random numbers, each from 10 to 99.
        //   You must use a loop to fill up the list.
        for (int idx = 0; idx < 1000; idx++) {
            tmpInteger = 10 + numberGenerator.nextInt(90);
            displayArray.add(tmpInteger);
        }

//   Then display the contents of the ArrayList on the screen.
        System.out.println("ArrayList: " + displayArray);

    }
}



