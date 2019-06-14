package com.company;

import java.util.ArrayList;
import java.util.Random;

public class ArrayListCopy {

    public static void main(String[] args) {
        Random numberGenerator = new Random();
        Integer tmpInteger;

  ////     Create an ArrayList of Integers
        ArrayList<Integer> displayArray = new ArrayList<Integer>();

//        Fill the ArrayList with ten random numbers (1-100)
        for (int idx = 0; idx < 10; idx++) {
            tmpInteger = 1 + numberGenerator.nextInt(100);
            displayArray.add(tmpInteger);
        }

//        Copy each value from the ArrayList into another ArrayList of the same capacity
        ArrayList<Integer> displayArray2 = new ArrayList<Integer>();
        for(int idx = 0; idx < displayArray.size(); idx++ ) {
          displayArray2.add(displayArray.get(idx));
        }

//        Change the last value in the first ArrayList to a -7
        displayArray.set(displayArray.size()-1, -7);

//        Display the contents of both ArrayLists
         System.out.println("ArrayList1: " + displayArray);
         System.out.println("ArrayList2: " + displayArray2);

    }

}





