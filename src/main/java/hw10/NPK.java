package hw10;

import java.text.DecimalFormat;

public class NPK {
    private double Nitrogen = 10;
    private double Phosphorous = 5;
    private double Potassium = 14;
    private double amount = 0;
    private double ppmN = 0;
    private double ppmP = 0;
    private double ppmK = 0;
    private DecimalFormat numFormat = new DecimalFormat("#.00");

    private final double liter = 1000;
    private final double massP = 0.436;
    private final double massK = 0.83;

    // Default constructor

    public NPK () {
        this.Nitrogen = 0;
        this.Phosphorous = 0;
        this.Potassium = 0;
        this.amount = 0;
        this.ppmN = 0;
        this.ppmP = 0;
        this.ppmK = 0;
    }

    // Constructor for determining ppm values of elements per liter given a certain solute

    public NPK (double N, double P, double K, double amount) {
        this.Nitrogen = N;
        this.Phosphorous = P;
        this.Potassium = K;
        this.amount = amount;
    }

    // Constructor for determining solute value based on desired parts per million

    public NPK (double ppmN, double ppmP, double ppmK) {
        this.ppmN = ppmN;
        this.ppmP = ppmP;
        this.ppmK = ppmK;
    }

    // GET and SET for ppmN

    public double getPpmN() {
        return ppmN;
    }

    public void setPpmN(double ppmN) {
        this.ppmN = ppmN;
    }

    // GET and SET for ppmP

    public double getPpmP() {
        return ppmP;
    }

    public void setPpmP(double ppmP) {
        this.ppmP = ppmP;
    }

    // GET and SET for ppmN

    public double getPpmK() {
        return ppmK;
    }

    public void setPpmK(double ppmK) {
        this.ppmK = ppmK;
    }

    // GET and SET for amount

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    // GET and SET for Nitrogen

    public double getNitrogen() {
        return Nitrogen;
    }

    public void setNitrogen(double nitrogen) {
        Nitrogen = nitrogen;
    }

    // GET and SET for Phosphorous

    public double getPhosphorous() {
        return Phosphorous;
    }

    public void setPhosphorous(double phosphorous) {
        Phosphorous = phosphorous;
    }

    // GET and SET for Potassium

    public double getPotassium() {
        return Potassium;
    }

    public void setPotassium(double potassium) {
        Potassium = potassium;
    }

    // Print entire class

    public void printClass() {
        System.out.println("Nitrogen: " + this.Nitrogen + "%");
        System.out.println("Phosphorous: " + this.Phosphorous + "%");
        System.out.println("Potassium: " + this.Potassium + "%");
        System.out.println("Solute: " + this.amount + "mg");
        System.out.println("PPM N: " + this.ppmN);
        System.out.println("PPM P: " + this.ppmP);
        System.out.println("PPM K: " + this.ppmK);
        System.out.println("****************************************");
    }

    // Display resulting ppm values based on dilution rate and NPK value

    public void printElementProfile(double Nitrogen, double Phosphorous, double Potassium, double amount) {
        double ppmN = ((((Nitrogen / 100) * amount) / (this.liter + amount)) * 1000000);
        double ppmP = ((((Phosphorous * this.massP / 100) * amount) / (this.liter + amount)) * 1000000);
        double ppmK = ((((Potassium * this.massK / 100) * amount) / (this.liter + amount)) * 1000000);

        System.out.println("Nitrogen: " + numFormat.format(ppmN) + " ppm");
        System.out.println("Phosphorous: " + numFormat.format(ppmP) + " ppm");
        System.out.println("Potassium: " + numFormat.format(ppmK) + " ppm");
        System.out.println("****************************************");
    }

    public void printElementProfile() {
        printElementProfile(this.Nitrogen, this.Phosphorous, this.Potassium, this.amount);
    }
    // Display dilution rate based on desired ppm of elements and NPK

    public void printDilutionProfile(double ppmN, double ppmP, double ppmK) {
        double resultN = ppmN / ((this.Nitrogen / 100) * 1000);
        double resultP = ppmP / (((this.Phosphorous * massP) / 100) * 1000);
        double resultK = ppmK / (((this.Potassium * massK) / 100) * 1000);

        System.out.println("Nitrogen: " + numFormat.format(resultN) + "mg");
        System.out.println("Phosphorous: " + numFormat.format(resultP) + "mg");
        System.out.println("Potassium: " + numFormat.format(resultK) + "mg");
        System.out.println("****************************************");
    }

    public void printDilutionProfile() {
        printDilutionProfile(this.ppmN, this.ppmP, this.ppmK);
    }

    // Display NPK elements in their elemental form

    public void displayElementalForm(double N, double P, double K) {
        System.out.println("Elemental N: " + numFormat.format(N * 1) + "%");
        System.out.println("Elemental P: " + numFormat.format(P * this.massP) + " %");
        System.out.println("Elemental K: " + numFormat.format(K * this.massK) + " %");
        System.out.println("****************************************");
    }

    public void displayElementalForm() {
        displayElementalForm(this.Nitrogen, this.Phosphorous, this.Potassium);
    }
}
