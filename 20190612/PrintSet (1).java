package com.company;

import java.util.HashSet;
import java.util.Iterator;

public class PrintSet {
    public static void main(String args[]){
        //5,1,2,1,4,1,5`
        HashSet set= new HashSet();
        set.add(5);
        set.add(1);
        set.add(2);
        set.add(1);
        set.add(4);
        set.add(1);
        set.add(5);
        Iterator iterator=set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
