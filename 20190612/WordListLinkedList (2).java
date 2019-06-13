package com.company;


import java.util.LinkedList;
import java.util.List;

public class WordListLinkedList {
    public static void main(String[] args) {
        List wordList= new LinkedList();
        wordList.add("byte");
        wordList.add("case");
        wordList.add("catch");
        wordList.add("class");
        wordList.add("continue");
        wordList.add("do");
        wordList.add("double");
        wordList.add("else");
        wordList.add("extends");



        for(Object element : wordList) {
            System.out.println(element);
        }


    }
}
