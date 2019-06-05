import java.util.Scanner;

public class U1M1MRahman {
    public static final String planetName[]={"Venus", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
    public static final Double planetFactor[]={0.78, 0.39, 0.39, 1.17, 1.05, 1.23 };

    public static void main(String[] args) {
        Double earthWeight, planetWeight;
        Integer planetNumber;
        int planetListSize = planetName.length;

        //create an input scanner
        Scanner scanner = new Scanner(System.in);

        //get earth weight from user.
        System.out.println("enter your weight on earth");
        earthWeight = scanner.nextDouble();

        //get planet number from user
        for(int idx=0; idx<planetListSize; idx++) {
            System.out.println("Number:" + (idx+1) + " Planet:" + planetName[idx]);
        }
        System.out.println("enter the number of your planet");
        planetNumber = scanner.nextInt();
        planetNumber--;

        //calculate planet weight
        planetWeight = earthWeight * planetFactor[planetNumber];

        //print results
        System.out.println("Your weight on " + planetName[planetNumber] + " is " + planetWeight + "." );
    }
}

