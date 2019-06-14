package com.company;

import java.util.ArrayList;

public class U1M2L1PBD {

    public static void main (String[] args){
//        Create an ArrayList that can hold Integers.
        ArrayList<Integer> displayArray = new ArrayList<Integer>();

//        Add ten copies of the number -113 to the ArrayList.
        displayArray.add(-113);
        displayArray.add(-113);
        displayArray.add(-113);
        displayArray.add(-113);
        displayArray.add(-113);
        displayArray.add(-113);
        displayArray.add(-113);
        displayArray.add(-113);
        displayArray.add(-113);
        displayArray.add(-113);

//        Then display the contents of the ArrayList on the screen.
        System.out.println("Slot 0 contains a " + displayArray.get(0));
        System.out.println("Slot 1 contains a " + displayArray.get(1));
        System.out.println("Slot 2 contains a " + displayArray.get(2));
        System.out.println("Slot 3 contains a " + displayArray.get(3));
        System.out.println("Slot 4 contains a " + displayArray.get(4));
        System.out.println("Slot 5 contains a " + displayArray.get(5));
        System.out.println("Slot 6 contains a " + displayArray.get(6));
        System.out.println("Slot 7 contains a " + displayArray.get(7));
        System.out.println("Slot 8 contains a " + displayArray.get(8));
        System.out.println("Slot 9 contains a " + displayArray.get(9));
    }
}
