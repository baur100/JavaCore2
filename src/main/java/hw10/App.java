package hw10;

import java.sql.SQLOutput;

public class App {
    public static void main(String[] args) {

        // Product Class ******************************************************************

        String name = "Quantum Meter";
        double w = 12;
        double h = 10.5;
        double l = 11.4;
        double price = 34.50;

        Product pr = new Product(name, price, w, h, l);

        pr.printClass();
        pr.productDimension();
        pr.displayPrice();

        Product pr1 = new Product();

        pr1.setName("Table");
        pr1.setW(13);
        pr1.setH(15);
        pr1.setL(20);
        pr1.setPrice(200.99);

        pr1.printClass();

        // DLI Class **********************************************************************

        double length = 20;
        double width = 50;
        double ppfd = 1100;
        double hours = 18;
        int numL = 10;
        int wattage = 600;

        DLI dli = new DLI();    // Default instance

        // Setting values using Setters

        dli.setPpfd(ppfd);
        dli.setLength(length);
        dli.setWidth(width);
        dli.setHours(hours);
        dli.setNumL(numL);
        dli.setWattage(wattage);

        // Retrieving data using Getters

        System.out.println("PPDF : " + dli.getPpfd() + " umoles/m2s");
        System.out.println("Length : " + dli.getLength() + " ft");
        System.out.println("Width : " + dli.getWidth() + " ft");
        System.out.println("Photoperiod : " + dli.getHours() + " hr");
        System.out.println("Lights : " + dli.getNumL() + " units");
        System.out.println("Wattage : " + dli.getWattage() + " watts");
        System.out.println("****************************************");

        // Display data using methods

        dli.printClass();
        dli.printDLI();
        dli.printWattsFt();

        // Watts per Square Feet Constructor

        DLI dliFt = new DLI(numL, wattage, length, width);

        dliFt.printWattsFt();

        // DLI Constructor

        DLI dliD = new DLI(ppfd, hours);

        dliD.printDLI();

        // NPK Class **********************************************************************

        double N = 20;
        double P = 10;
        double K = 20;
        double solute = 1;

        NPK npk = new NPK();

        // Set dilution rate

        npk.setAmount(1);

        // Set Nitrogen, Phosphorous, Potassium values

        npk.setNitrogen(10);
        npk.setPhosphorous(5);
        npk.setPotassium(14);

        // Set desired PPM values for each element

        npk.setPpmN(150);
        npk.setPpmP(80);
        npk.setPpmK(240);


        // Run method based on set methods

        npk.displayElementalForm();

        // Run method based on arguments

        npk.displayElementalForm(N, P, K);

        // Run method based on set methods

        npk.printElementProfile();

        // Run method based on arguments

        npk.printElementProfile(N,P,K,solute);

        // Run method based on arguments

        npk.printDilutionProfile(175,100,255.5);

        npk.printClass();
    }
}
