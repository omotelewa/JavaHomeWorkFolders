package com.company;

import java.util.ArrayList;
import java.util.Random;

public class ArrayListRandom {
    public static void main(String[] args) {
        Random numberGenerator = new Random();
        Integer tmpInteger;

//   Create an ArrayList of Integers.
        ArrayList<Integer> displayArray = new ArrayList<Integer>();

 //   Fill up the list with ten random numbers, each from 1 to 100.
 //   You must use a loop to fill up the list.
         for (int idx = 0; idx <10; idx++){
             tmpInteger = numberGenerator.nextInt(101);
             displayArray.add(tmpInteger);
         }

//   Then display the contents of the ArrayList on the screen.
        System.out.println( "ArrayList: " + displayArray );

    }
}



