package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ArrayListFind {
    public static void main(String[] args) {
        Random numberGenerator = new Random();
        Integer tmpInteger;

//        Create an ArrayList that can hold Integers, and fill each slot with a different random value from 1-50.
        ArrayList<Integer> displayArray = new ArrayList<Integer>();
        for (int idx = 0; idx <10; idx++){
            tmpInteger =  1 + numberGenerator.nextInt(50);
            displayArray.add(tmpInteger);
        }
//        Display those values on the screen, and then prompt the user for an integer. Search through the ArrayList,
        System.out.println( "ArrayList: " + displayArray );
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter username");
//        and if the item is present, say so. It is not necessary to display anything if the value was not found.
//        If the item is in the ArrayList multiple times, it's okay if the program prints the message more than once.


        //   Fill up the list with ten random numbers, each from 1 to 100.
        //   You must use a loop to fill up the list.


//   Then display the contents of the ArrayList on the screen.
        System.out.println( "ArrayList: " + displayArray );

    }
}



