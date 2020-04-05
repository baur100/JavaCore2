package hw13;

public class App {
    public static void main(String[] args) {
        // Create necessary preconditions

        double price = 10.99;
        int quantity = 20;

        /*
            RegularPolicy, SeniorPolicy, StudentPolicy
            are classes that implement Policy interface
        */

        // Example 1
        System.out.println("Example 1");

        Client john = new Client(price, quantity);
        Client jack = new Client(price, quantity);
        Client joseph = new Client(price, quantity);

        john.printPrice(new RegularPolicy());
        joseph.printPrice(new StudentPolicy());
        jack.printPrice(new SeniorPolicy());

        // Example 2
        System.out.println();
        System.out.println("Example 2");

        Client test = new Client();
        test.setPrice(30.85);
        test.setQuantity(10);

        // Create an array of objects

        Policy[] policies = {new RegularPolicy(), new SeniorPolicy(), new StudentPolicy()};

        for (Policy p : policies) {
            test.printPrice(p);
        }

        System.out.println();
        System.out.println("Example 3");

        // Fuel, BrakesType Interfaces are used
        // SUV inherits from Vehicle Class

        Vehicle corolla = new Vehicle(new Brake(), 18000, "TOYOTA", "COROLLA", 4);
        SUV rav4 = new SUV(new BrakeABS(), 20000, "TOYOTA", "RAV4", 4, "CITY");
        corolla.fuel();
        rav4.fuel();

        BrakesType reg = new Brake();
        BrakesType abs = new BrakeABS();
        rav4.setBrakes(reg);
        corolla.setBrakes(abs);

        rav4.applyBrakes();
        corolla.applyBrakes();

        Vehicle lexus = new SUV(reg, 30000, "LEXUS", "LX300", 4, "CITY");
        System.out.println();
        System.out.println(lexus.getMake());
        System.out.println(lexus.getModel());
        System.out.println(lexus.getPrice());
        System.out.println(lexus.getSeats());
        lexus.applyBrakes();
        System.out.println();
        lexus.printInfo();
        System.out.println();
        corolla.printInfo();
        System.out.println();
        rav4.printInfo();
    }
}
