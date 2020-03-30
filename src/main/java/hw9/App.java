package hw9;


import static hw9.Buket.deliveryPrice;
import static hw9.Buket.orderPrice;

public class App {
    public static void main(String[] args) {
        // Student
        System.out.println();
        Student studentID1 = new Student();
        studentID1.firstName = "John";
        studentID1.lastName = "Smith";
        studentID1.state = "CA";
        studentID1.email = "John.Smith@gmail.com";
        studentID1.phoneNumber = "4151231212";


        Student studentID2 = new Student();
        studentID2.firstName = "Ron";
        studentID2.lastName = "Drake";
        studentID2.state = "FL";
        studentID2.email = "Ron878@gmail.com";
        studentID2.phoneNumber = "7888557998";

        studentID1.printInfo();
        System.out.println();
        studentID2.printInfo();

        // Buket
        System.out.println();
        Buket flowerID1 = new Buket();
        flowerID1.name = "Rose";
        flowerID1.count = 25;
        flowerID1.price = 8.25;
        double orderPrice1 = orderPrice(flowerID1.count, flowerID1.price);
        double deliveryPrice1 = deliveryPrice(orderPrice1);
        flowerID1.totalPrice(orderPrice1, deliveryPrice1);


        System.out.println();
        Buket flowerID2 = new Buket();
        flowerID2.name = "Tulip";
        flowerID2.count = 11;
        flowerID2.price = 3.75;
        double orderPrice2 = orderPrice(flowerID2.count, flowerID2.price);
        double deliveryPrice2 = deliveryPrice(orderPrice2);
        flowerID1.totalPrice(orderPrice2, deliveryPrice2);

        System.out.println();
        Buket flowerID3 = new Buket();
        flowerID3.name = "Mixed";
        flowerID3.count = 25;
        flowerID3.price = 0.99;
        double orderPrice3 = orderPrice(flowerID3.count, flowerID3.price);
        double deliveryPrice3 = deliveryPrice(orderPrice3);
        flowerID1.totalPrice(orderPrice3, deliveryPrice3);

        //Computer
        Computer computerid1 = new Computer();
        computerid1.brand = "Apple";
        computerid1.CPU = "Intel i5";
        computerid1.RAM = 8;
        computerid1.internalGPU = 2;
        computerid1.storage = 256;

        Computer computerid2 = new Computer();
        computerid2.brand = "Dell";
        computerid2.CPU = "Intel i7";
        computerid2.RAM = 16;
        computerid2.externalGPU = 4;
        computerid2.storage = 512;

        Computer computerid3 = new Computer();
        computerid3.brand = "HP";
        computerid3.CPU = "Intel i7";
        computerid3.RAM = 8;
        computerid3.externalGPU = 4;
        computerid3.externalGPU = 2;
        computerid3.storage = 512;

        System.out.println();
        computerid1.printInfo();
        System.out.println();
        computerid2.printInfo();
        System.out.println();
        computerid3.printInfo();

        // Dating
        System.out.println();

        Dating datingID1 = new Dating();
        datingID1.age = 24;
        datingID1.gender = false;
        datingID1.height = 179;
        datingID1.name = "Alex";
        String genderID1 = datingID1.genderVar(datingID1.gender);
        datingID1.printInfo(genderID1);
        System.out.println();


        Dating datingID2 = new Dating();
        datingID2.age = 23;
        datingID2.gender = true;
        datingID2.height = 169;
        datingID2.name = "Rose";
        String genderID2 = datingID2.genderVar(datingID2.gender);
        datingID2.printInfo(genderID2);
        System.out.println();

        Dating datingID3 = new Dating();
        datingID3.age = 31;
        datingID3.gender = false;
        datingID3.height = 181;
        datingID3.name = "Rick";
        String genderID3 = datingID3.genderVar(datingID3.gender);
        datingID3.printInfo(genderID3);
        System.out.println();

        Dating datingID4 = new Dating();
        datingID4.age = 19;
        datingID4.gender = true;
        datingID4.height = 161;
        datingID4.name = "Vanessa";
        String genderID4 = datingID4.genderVar(datingID4.gender);
        datingID4.printInfo(genderID4);
        System.out.println();

    }

}
