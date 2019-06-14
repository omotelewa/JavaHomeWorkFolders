package com.company;

import java.util.ArrayList;

public class ArrayListLoop {

    public static void main (String[] args){
//        Create an ArrayList that can hold Integers.
        ArrayList<Integer> displayArray = new ArrayList<Integer>();


//        Add ten copies of the number -113 to the ArrayList.

////      This time, you must use a loop, both to fill up the ArrayList and to display it.
//        Also,in the condition of your loop, you should not count up to a literal number.
//        Instead you should use the size() of your ArrayList.

        for(int idx = 0; idx < 10; idx++ ) {
            displayArray.add(-113);
          }

//        Then display the contents of the ArrayList on the screen.
        for(int idx = 0; idx < displayArray.size(); idx++ ) {
            System.out.println("Slot " + idx + " contains a " + displayArray.get(idx));
        }
    }
}
