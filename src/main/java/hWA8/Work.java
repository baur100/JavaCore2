package hWA8;

public class Work {
    public static void main(String[] args) {
        Cat myCat = new Cat();
        Book myBook = new Book();
        Boat myBoat = new Boat();
        Airplane airplane=new Airplane();

        myCat.country="USA";
        myCat.age=2;
        myCat.bride="DvorCat";
        myCat.name="Pussy";

        myCat.printInfo();
        myCat.catMoving();
        myCat.catSlip();
        myCat.catSong();
        System.out.println("");

        myCat.country="Germany";
        myCat.age=8;
        myCat.bride="Gipsy";
        myCat.name="Lion";

        myCat.printInfo();
        myCat.catMoving();
        myCat.catSlip();
        myCat.catSong();

        System.out.println("");

        myBook.numberOfPages=208;
        myBook.author="Paulo Coelho";
        myBook.hardEdition="Yes";
        myBook.digital="Yes";
        myBook.condition="New";
        myBook.name="Alchemist - 25th Aniv.";
        myBook.year=2013;

        myBook.printInfo();
        myBook.bookEdition();
        myBook.bookSize();
        myBook.conditionBook();

        System.out.println("");

        myBook.numberOfPages=504;
        myBook.author="Karen Cho";
        myBook.hardEdition="Yes";
        myBook.digital="No";
        myBook.condition="Used";
        myBook.name="Gerra na Lua";
        myBook.year=2012;

        myBook.printInfo();
        myBook.bookEdition();
        myBook.bookSize();
        myBook.conditionBook();

        System.out.println("");

        myBoat.numPassangers=6;
        myBoat.spead=10.0;
        myBoat.tankVolume = 100;
        myBoat.portName="Dana Point";
        myBoat.engine = "Gas";
        myBoat.name = "Estrela do Mar";
        myBoat.price = 13000;
        myBoat.type="leasure";
        myBoat.year=2013;

        myBoat.printInfo();
        myBoat.capacityOfBoat();
        myBoat.commercialInfo();
        myBoat.technicalInfo();


        System.out.println("");

        myBoat.numPassangers=4;
        myBoat.spead=10.0;
        myBoat.tankVolume = 80;
        myBoat.portName="Dana Point";
        myBoat.engine = "Wing";
        myBoat.name = "Coco";
        myBoat.price = 4000;
        myBoat.type="leasure";
        myBoat.year=2011;

        myBoat.printInfo();
        myBoat.capacityOfBoat();
        myBoat.commercialInfo();
        myBoat.technicalInfo();

        System.out.println("");
        airplane.numHr=8000;
        airplane.numPassangers=235;
        airplane.capacity=18000;
        airplane.condition="used";
        airplane.type="commercial";
        airplane.brand="Boing";
        airplane.model="A-999";
        airplane.price=230000;

        airplane.printInfo();
        airplane.commercialInfo();
        airplane.technicalInfo();



        System.out.println("");
        airplane.numHr=1000;
        airplane.numPassangers=500;
        airplane.capacity=16000;
        airplane.condition="new";
        airplane.type="commercial";
        airplane.brand="Airbus";
        airplane.model="A-3565";
        airplane.price=1800000;

        airplane.printInfo();
        airplane.commercialInfo();
        airplane.technicalInfo();






    }
}
