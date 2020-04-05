package hw8;

import javax.security.auth.login.AccountLockedException;

public class app {
    public static void main(String[] args) {

        // Address class
        Address california = new Address();
        california.state = "California";
        california.city = "San Francisco";
        california.street = "Market St";
        california.building = 19;
        california.apartment = 40;
        california.zip = 94100;

        Address newYork = new Address();
        newYork.zip = 100119;
        newYork.apartment = 2;
        newYork.building = 255;
        newYork.state ="New York";
        newYork.city = "New York";
        newYork.street = "Madison Ave";

        System.out.println("My address is "+california.apartment+" - "+california.building+", "+california.street+", "+california.city+", "+california.state+", "+california.zip);


        newYork.deliver();
        california.pickup();

        //Employee class
        Employees john = new Employees();
        john.name = "John";
        john.lastName = "Brown";
        john.age = 32;
        john.department = "Sales";
        john.salary = 60000;

        Employees jenifer = new Employees();
        jenifer.name = "Jenifer";
        jenifer.lastName ="Smith";
        jenifer.salary = 82000;
        jenifer.department ="QA";
        jenifer.age = 26;

        jenifer.work();
        john.meeting();

        //Clothes class

        Clothes shirt = new Clothes();
        shirt.item = "shirt";
        shirt.brand = "Hilfiger";
        shirt.color = "blue";
        shirt.size = 42;
        shirt.price = 29.99;

        Clothes jeans = new Clothes();
        jeans.item = "jeans";
        jeans.brand = "Wrangler";
        jeans.size = 34;
        jeans.price = 55.99;

        shirt.sale();
        jeans.out();

        //Phones class

        Phones iphone = new Phones();
        iphone.brand = "iPhone";
        iphone.model = "11Pro";
        iphone.color = "Silver";
        iphone.memory = 256;
        iphone.price = 999.00;

        Phones samsung = new Phones();
        samsung.brand = "Samsung";
        samsung.memory = 512;
        samsung.color = "White";
        samsung.model = "Galaxy S20";
        samsung.price = 949.99;
        if (samsung.price>iphone.price){
            System.out.println("Samsung is more expensive than iPhone");
        }else{
            System.out.println("Samsung is cheaper than iPhone ");

            iphone.bluetooth();
            samsung.ringing();
        }





        }
}
