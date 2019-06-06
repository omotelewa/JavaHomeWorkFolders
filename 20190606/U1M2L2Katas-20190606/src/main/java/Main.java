package com.company;
public class Main {
    public static void main(String args[]) {

        int[] loc = {500, 300};
        System.out.println("\nMouse object");
        ComputerMouse computerMouse = new ComputerMouse("Razer", "Storm", 560, 340, loc);

        computerMouse.display();
        ComputerMouse computerMouse2 = new ComputerMouse("Razer", "Mega", 640, 480, loc);
        computerMouse2.display();

        computerMouse2 = App.createComputerMouse();
        computerMouse2.display();

        System.out.println("\nCar object");
        Car c = new Car("BMW", "M16", "Sedan", "Black", "3.0 V8", "CVT", 4, 40, 30218);
        c.display();
        Car c2 = new Car("Toyoto", "Supra", "Sedan", "Red", "3.0 V6", "CVT", 2, 38, 40218);
        c2.display();
        c2 = App.createCar();
        c2.display();


        System.out.println("\nCoffwee Maker object");
        CoffeeMaker cm = new CoffeeMaker("Sony", "M5", 15, 10, true);
        cm.display();
        CoffeeMaker cm1 = new CoffeeMaker("Samsung", "S118", 20, 13, false);
        cm1.display();
        cm1 = App.createCoffeeMaker();
        cm1.display();
        System.out.println("\nMicrowave object");
        Microwave mw = new Microwave("Honda", "B10", 50, "01:00", false);
        mw.display();
        Microwave mw2 = new Microwave("Mada", "m50", 40, "02:25", true);
        mw2.display();
        mw2 = App.createMicrowave();
        mw2.display();
        System.out.println("\nRadio object");
        Radio rd = new Radio("Senheizer", "Hd 4.20 BT", 2, "WUNV", 60, true);
        rd.display();
        Radio rd1 = new Radio("Sony", "Hd 503", 2, "WUNV", 55, true);
        rd1.display();
        rd1 = App.createRadio();
        rd1.display();
        System.out.println("\nTV object");
        TV tv = new TV("Sony Bravia", "W43BT", 43, "HBO", 30, true);
        tv.display();
        TV tv1 = new TV("Samsung SMART", "SM5540", 65, "CNN", 50, true);
        tv1.display();
        tv1 = App.createTV();
        tv1.display();
    }
}
