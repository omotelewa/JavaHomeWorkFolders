import java.util.Random;
import java.util.Scanner;
public class U1M1MRahman {

    public static void main(String[] args) {

        int dice1, dice2;
        String tempStr;
        Random randomGenerator = new Random();

        //create an input scanner
        Scanner scanner = new Scanner(System.in);

        //press any key.
        System.out.print("Press any key and <enter> to throw the dice" );
        tempStr = scanner.next();

        // Throw 2 random dice.
        dice1 = randomGenerator.nextInt(6) +1;
        dice2 = randomGenerator.nextInt(6) +1;

        //print score out.
        System.out.println("Your score is " + (dice1 + dice2));

    }
}