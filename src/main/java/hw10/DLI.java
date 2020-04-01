package hw10;

import java.text.DecimalFormat;

public class DLI {

    // Declare and Initialize Fields

    private final int seconds = 3600;
    private final int umoles = 1000000;
    private int numL = 0;
    private int wattage = 0;
    private double length = 1;
    private double width = 1;
    private double ppfd = 0;
    private double hours = 0;
    private DecimalFormat numFormat = new DecimalFormat("#.00");

    // Constructor for empty instance

    public DLI (){};

    // Constructor for watts per square foot method

    public DLI (int numL, int wattage, double length, double width) {
        this.numL = numL;
        this.wattage = wattage;
        this.length = length;
        this.width = width;
    }

    // Constructor for Daily Light Integral provided Photosynthetic Photon Flux Density is available

    public DLI (double ppfd, double hours) {
        this.ppfd = ppfd;
        this.hours = hours;
    }

    // GET and SET for Hours

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    // GET and SET for Length

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length < 1 ) {
            System.out.println("Length cannot be less than 1");
            return;
        }
        this.length = length;
    }

    // GET and SET for Width

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width < 1) {
            System.out.println("Width cannot be less than 1");
        }
        this.width = width;
    }

    // GET and SET for PPFD

    public double getPpfd() {
        return ppfd;
    }

    public void setPpfd(double ppfd) {
        this.ppfd = ppfd;
    }

    // GET and SET for NumL

    public int getNumL() {
        return numL;
    }

    public void setNumL(int numL) {
        this.numL = numL;
    }

    // GET and SET for Wattage

    public int getWattage() {
        return wattage;
    }

    public void setWattage(int wattage) {
        this.wattage = wattage;
    }

    // Available Methods

    public void printClass () {
        System.out.println("DLI: " + numFormat.format(calculateDLI()) + " moles/day");
        System.out.println("Photoperiod: " + this.hours + " hr");
        System.out.println("Area: " + numFormat.format(area()) + " sqFt");
        System.out.println("Watts/SqFt: " + numFormat.format(wattsFt()) + " watts/sqFt");
        System.out.println("****************************************");
    }

    public void printDLI() {
        System.out.println("DLI: " + numFormat.format(calculateDLI()) + " moles/day");
        System.out.println("****************************************");
    }

    public void printWattsFt() {
        System.out.println("Watts/SqFt: " + numFormat.format(wattsFt()) + " watts/sqFt");
        System.out.println("****************************************");
    }

    private double calculateDLI () {
        // Calculate Daily Light Integral
        return (this.ppfd * (this.seconds * this.hours) / this.umoles);
    }

    private double area () {
        // Calculate area
        return this.length * this.width;
    }
        // Calculate Watts per Square Foot
    private double wattsFt () {
            return ((this.numL * wattage) / area());
    }

}
