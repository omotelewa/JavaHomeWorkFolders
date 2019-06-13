package com.company;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Application {

    public static void main(String[] args)  {
        String chosenPet;
        while(true){
            int petIndex = Pets.choosePet();

            try {
                chosenPet= Pets.retrievePet(petIndex);
                break;
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("YOu chose a wrong number. Please provide a number in the list");
            }
        }


        try {
            Pets.readPetsFromFile();
        } catch (FileNotFoundException e) {
            System.out.println("Sorry! the file is not present in the location. Please check the location and try again later");
        }
//
        try {
            Pets.writePetToFile(chosenPet);
        } catch (IOException e) {
            System.out.println("Cannot write to the file. Please try again later");
        }

        finally {
            System.out.println("Have a nice day!");
        }
    }
}
