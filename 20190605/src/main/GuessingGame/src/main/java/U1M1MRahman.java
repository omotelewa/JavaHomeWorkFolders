import java.util.Random;
import java.util.Scanner;

public class U1M1MRahman {
    public static void main(String[] args) {
        int randomNumber, guess;
        Random randomGenerator = new Random();

        //create an input scanner
        Scanner scanner = new Scanner(System.in);

        //choose a random  number from 1 - 10
        randomNumber = randomGenerator.nextInt(10) + 1;

        //ask user for their guess
        System.out.println("Guess a number from 1 - 10");
        guess = scanner.nextInt();

        // tell user if right or wrong, if wrong show the number
        if ( guess == randomNumber ){
            System.out.println("Your guess is correct!");
        } else {
            System.out.println("Your guess was incorrect, the number was " + randomNumber);
        }

    }
}
