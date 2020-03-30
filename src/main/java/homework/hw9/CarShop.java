package homework.hw9;

public class CarShop {
    public static void main(String[] args) {
        Engine engine1 = new Engine();
        engine1.make = "Honda";
        engine1.capacity = 4.8;
        engine1.numberOfCilinders = 6;
        engine1.waight = 300;
        engine1.alternatorIsGood = true;
        engine1.sparkPlugsAreGood = false;

        Engine engine2 = new Engine();
        engine2.make = "Toyota";
        engine2.capacity = 3.5;
        engine2.numberOfCilinders = 4;
        engine2.waight = 280;
        engine2.alternatorIsGood = false;
        engine2.sparkPlugsAreGood = true;

        Battery battery1 = new Battery();
        battery1.make = "SomeCompany";
        battery1.weight = 20;
        battery1.charge = 99;

        Battery battery2 = new Battery();
        battery2.make = "Bosch";
        battery2.weight = 25;
        battery2.charge = 100;

        Wheels wheels1 = new Wheels();
        wheels1.radius = 18;
        wheels1.tireMake = "GoodYear";
        wheels1.isTireGood = false;

        Wheels wheels2 = new Wheels();
        wheels2.radius = 16;
        wheels2.tireMake = "GoodYear";
        wheels2.isTireGood = true;

        Body body1 = new Body();
        body1.numberOfDoors = 2;
        body1.color = "white";

        Body body2 = new Body();
        body2.numberOfDoors = 4;
        body2.color = "red";


        System.out.println("\u001B[31m__________________Current state:__________________ \u001B[0m");
        engine1.printInfo("engine1");
        engine2.printInfo("engine2");

        engine1.changeSparkplugs();
        engine2.changeAlternator();

        System.out.println();
        System.out.println("\u001B[32m__________________New state:__________________ \u001B[0m");

        engine1.printInfo("engine1");
        engine2.printInfo("engine2");


    }
}
