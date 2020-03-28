package myLesson9;

import java.util.concurrent.BrokenBarrierException;

public class App {
    public static void main(String[] args) {
        String xx = new String();
        int[] arr = new int[10];
        Car car = new Car();
        car.brand = "Toyota";
        car.model = "Camry";
        car.color = "Silver";
        car.year = 2015;
        car.price = 13000;

        Car yourCar = new Car();
        yourCar.brand = "Lexus";
        yourCar.model = "RX400h";
        yourCar.color = "Silver";
        yourCar.year = 2006;
        yourCar.price = 7500;

        car.drive();
        yourCar.printInfo();

        System.out.println("My new car is " + car.brand + " " + car.model + " " + car.year);
        System.out.println("My old car is " + yourCar.brand + " " + yourCar.model + " " + yourCar.year);

        Person Anna = new Person();
        Anna.name = "Anna";
        Anna.lastName = "Ivanova";
        Anna.eyeColor = "Blue";
        Anna.heigth = 102;
        Anna.year = 2015;

        var Boris = new Person();
        Boris.name = "Boris";
        Boris.lastName = "Petrov";
        Boris.year = 2015;
        Boris.heigth = 110;
        Boris.eyeColor = "Brown";

        Boris.printInfo();

        Fruit ff = new Fruit();
        ff.name = "Apple";
        ff.color = "Green";

        var sharik = new Dog();
        sharik.name = "Sharik";
        sharik.age = 2;
        sharik.breed = "Dvorterier";

        Dog lord = new Dog();
        lord.name = "Lord";
        lord.age = 3;
        lord.breed = "Dog";

        if (sharik.age > lord.age) {
            System.out.println("Sharik is older");
        } else {
            System.out.println("Lord is older");
        }
        lord.bark();
        sharik.bark();
        lord.sleep();
    }
}
