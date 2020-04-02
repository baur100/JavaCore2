package hw10;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Computer build1 = new Computer();
        int[] credit1 = {169, 12};
        build1.setBrand("Apple");
        build1.setCPU("Intel i7");
        build1.setRAM(16);
        build1.setSSD(1024);
        build1.setPrice(1999);
        build1.setPayment(credit1);
        System.out.println();

        System.out.println(build1.getBrand() + " with " + build1.getCPU()
                + ". Get only for $" + build1.getPrice() + "!");
        build1.printInfo();

        Computer build2 = new Computer();
        int[] credit2 = {99, 12};
        build2.setBrand("Dell");
        build2.setCPU("Intel i7");
        build2.setRAM(8);
        build2.setSSD(512);
        build2.setPrice(1199);
        build2.setPayment(credit2);
        System.out.println();

        System.out.println(build2.getBrand() + " with " + build2.getCPU()
                + ". Get only for $" + build2.getPrice() + "!");
        build2.printInfo();

        Computer build3 = new Computer();
        int[] credit3 = {79, 12};
        build3.setBrand("Apple");
        build3.setCPU("Intel i3");
        build3.setRAM(8);
        build3.setSSD(256);
        build3.setPrice(949);
        build3.setPayment(credit2);
        System.out.println();

        System.out.println(build3.getBrand() + " with " + build3.getCPU()
                + ". Get only for $" + build3.getPrice() + "!");
        build3.printInfo();

        Books book1 = new Books("Anna Burns", "Milkman", 7.99);
        Books book2 = new Books("Steve Coll", "Directorate S", 11.19);
        Books book3 = new Books("Nora Krug", "Belonging", 18.78);

        book1.printInfo();
        book2.printInfo();
        book3.printInfo();

        Testcase user1 = new Testcase("Indu", 4, 19, 23);
        Testcase user2 = new Testcase("Mikaela", 6, 15, 21);
        Testcase user3 = new Testcase("Rick", 6, 20, 26);
        user1.printInfo();
        user2.printInfo();
        user3.printInfo();
    }
}
