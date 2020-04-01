package Homework10;

public class App {
    public static void main(String[] args) {
        Stores Store = new Stores();
        Store.name = "Whole Foods";
        Store.producequality = "high quality";
        Store.averagecheck = 100.00;

        Stores StoreOne = new Stores("Trader Joes", "high quality", 75.00);
        System.out.println(StoreOne.name);

        Store.printStores();
        StoreOne.printStores();

        Stores StoreTwo = new Stores ("Walmart");
        StoreTwo.printStores();

//        Job JobTwo = new Job();

        Job JobOne = new Job("Tester","Technology");
        JobOne.printJob();

        Job JobThree = new Job("Automation engineer","Technology", 50.00);
        JobThree.printJob();
    }
}
