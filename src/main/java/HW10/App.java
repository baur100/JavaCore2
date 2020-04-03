package HW10;

public class App {
    public static void main(String[] args) {
        Garden garden1 = new Garden("Peach", "Rose", 70);
        garden1.printGardenInfo();

        Garden garden2 = new Garden("Apple", "Lilac", 66);
        garden2.printGardenInfo();

        Garden garden3 = new Garden("Kiwi", "Sunflower", 72);
        garden3.printGardenInfo();



        Classmates cm1 = new Classmates("Pete", "Abbot", "ID = 2500");
        cm1.printClassmatesInfo();

        Classmates cm2 = new Classmates("Maria", "Gonzales", "ID = 1538");
        cm2.printClassmatesInfo();


        Classmates anna = new Classmates();
        anna.setName("Anna");
        anna.setLastname("Winter");
        anna.setId("ID = 1098");

        anna.printClassmatesInfo();




        OfficeSupplies os1 = new OfficeSupplies("Notebook", 11, " for MAth", 22);
        os1.printInfoOfficeSupplies();

        OfficeSupplies os2 = new OfficeSupplies("Album", 9, "for Art", 20);
        os2.printInfoOfficeSupplies();

        OfficeSupplies os3 = new OfficeSupplies("Book", 10, "for Spanish", 25);
        os3.printInfoOfficeSupplies();

    }
}

