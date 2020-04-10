package hWA10;

public class Work {
    public static void main(String[]args) {
        Boat myBoat = new Boat();

        int[] numPass={4,6,8,10,12};
        myBoat.setEngine("gas");
        myBoat.setName("Estrela do mar");
        myBoat.setNumPassengers(numPass);
        myBoat.setPortName("Porto");
        myBoat.setPrice(12000);
        myBoat.setSpead(12);
        myBoat.setTankVolume(320);
        myBoat.setType("leasure");
        myBoat.setYear(2012);

        myBoat.printInfo();
        System.out.println("========================");

        Boat newBoat = new Boat("Caravela",2020, 1800000,"GAS","Cascais",1800.0,18.2,numPass,"leasure");
        newBoat.printInfo();



        System.out.println("********************");

        Book myBook = new Book();

        int[]nPages ={108,253,304};
        myBook.setAuthor("Kardashian");
        myBook.setCondition("used");
        myBook.setDigital("yes");
        myBook.setHardEdition("yes");
        myBook.setName("One day of my Life");
        myBook.setYear(2019);
        myBook.setNumberOfPages(nPages);

        myBook.printInfo();
        System.out.println("========================");




        Book newBook = new Book("What else",nPages,"yes","Komarov", 2020,"No","new");

        newBook.printInfo();

        System.out.println("********************");

        Airplane myPlane = new Airplane();
        int [] numPassPlain={4,8,6};
        myPlane.setBrand("Airbus");
        myPlane.setCapacity(18000);
        myPlane.setCondition("used");
        myPlane.setModel("A-320");
        myPlane.setNumHr(120);
        myPlane.setPrice(1800000);
        myPlane.setType("industrial");
        myPlane.setNumPassengers(numPass);


        myPlane.printInfo();
        System.out.println("========================");

        Airplane newPlain = new Airplane("Boing","770", 180000, numPassPlain, "new",24000000, 0, "industrial");

        newPlain.printInfo();


    }
}
