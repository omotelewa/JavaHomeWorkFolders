package com.company;

import java.util.ArrayList;
import java.util.List;

public class ClassmatesMain {
    public static void main(String args[]){
        List<Classmate> classmates= new ArrayList<Classmate>();

        Classmate cm1= new Classmate("Max", "Red");
        classmates.add(cm1);
        Classmate cm2= new Classmate("Bob", "Black");
        classmates.add(cm2);
        Classmate cm3= new Classmate("Mike", "Yellow");
        classmates.add(cm3);
        Classmate cm4= new Classmate("Mic", "Purple");
        classmates.add(cm4);
        Classmate cm5= new Classmate("Julie", "Pink");
        classmates.add(cm5);

        for (Classmate c: classmates){
            System.out.println("Name:"+ c.getName());
            System.out.println("HairColor:"+ c.getHairColor());
        }


    }
}
