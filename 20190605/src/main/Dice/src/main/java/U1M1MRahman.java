import java.util.Random;
import java.util.Scanner;
public class U1M1MRahman {
    public static final String fortunes[]={
             "Good Luck"
            , "Happy"
            , "Doing Great"
            , "Exciting"
            , "Good Health"
            , "Bright Future"};

    public static void main(String[] args) {

        int randomNumber;
        String tempStr;
        Random randomGenerator = new Random();

        //create an input scanner
        Scanner scanner = new Scanner(System.in);

        //press any key.
        System.out.print("Press any key and <enter> to get your fortune" );
        tempStr = scanner.next();

        // choose a random fortune.
        randomNumber = randomGenerator.nextInt(6);

        //print fortune out.
        System.out.println("Your fortune is " + fortunes[randomNumber]);

        //choose random lotto numbers and print.
        for ( int i = 0; i < 6; i++ ){
            randomNumber = randomGenerator.nextInt(54) + 1;
            System.out.print(" " + randomNumber);
        }

    }
}