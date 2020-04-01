package homework.hw10;

public class Engine {
    private String make;
    private double capacity;
    private int numberOfCilinders;
    private int waight;

    private boolean alternatorIsGood;
    private boolean sparkPlugsAreGood;

    private String[] datesServiced;

    public Engine() {
    }

    public Engine(String make, double capacity, int numberOfCilinders, int waight, boolean alternatorIsGood, boolean sparkPlugsAreGood, String[] datesServiced) {
        this.make = make;
        this.capacity = capacity;
        this.numberOfCilinders = numberOfCilinders;
        this.waight = waight;
        this.alternatorIsGood = alternatorIsGood;
        this.sparkPlugsAreGood = sparkPlugsAreGood;
        this.datesServiced = datesServiced;
    }

    public String[] getDatesServiced() {
        return datesServiced;
    }

    public void setDatesServiced(String[] datesServiced) {
        this.datesServiced = datesServiced;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public void setNumberOfCilinders(int numberOfCilinders) {
        this.numberOfCilinders = numberOfCilinders;
    }

    public void setAlternatorIsGood(boolean alternatorIsGood) {
        this.alternatorIsGood = alternatorIsGood;
    }

    public void setSparkPlugsAreGood(boolean sparkPlugsAreGood) {
        this.sparkPlugsAreGood = sparkPlugsAreGood;
    }

    public void setWaight(int waight) {
        this.waight = waight;
    }

    public double getCapacity() {
        return capacity;
    }

    public int getNumberOfCilinders() {
        return numberOfCilinders;
    }

    public int getWaight() {
        return waight;
    }

    public String getMake() {
        return make;
    }

    public boolean getAlternatorIsGood() {
        return alternatorIsGood;
    }

    public boolean getSparkPlugsAreGood() {
        return sparkPlugsAreGood;
    }


    public void checkEngine() {
        if (this.alternatorIsGood == true && this.sparkPlugsAreGood == true) {
            System.out.println("Engine is good");
        } else {
            if (alternatorIsGood == false) {
                System.out.println("Check alternator");
            } else {
                System.out.println("Check sparkplugs");
            }
        }
    }

    public void changeAlternator() {
        System.out.println();
        System.out.println("-----------------------------------------Action-----------------------------------------");
        this.alternatorIsGood = true;
        System.out.println("\u001B[32m Alternator is changed \u001B[0m");
    }

    public void changeSparkplugs() {
        System.out.println();
        System.out.println("-----------------------------------------Action-----------------------------------------");
        this.sparkPlugsAreGood = true;
        System.out.println("\u001B[32m Sparkplugs are changed \u001B[0m");
    }

    public void printInfo(String engine) {
        System.out.println();
        System.out.println("---------" + engine + "---------");
        System.out.println();
        System.out.println("Engine make: " + this.make);
        System.out.println("Engine capacity: " + this.capacity);
        System.out.println("Number of Cilinders: " + this.numberOfCilinders);
        System.out.println("weight: " + this.waight);
        System.out.println("Last Serviced: " + datesServiced[datesServiced.length - 1]);

        System.out.println();
        System.out.println("Engine details:");
        if (this.alternatorIsGood == false) {
            System.out.println("\u001B[31m Alternator needs to be replaced \u001B[0m");
        } else {
            System.out.println("Alternator is good");
        }
        if (this.sparkPlugsAreGood == false) {
            System.out.println("\u001B[31m Sparkplugs needs to be replaced \u001B[0m");
        } else {
            System.out.println("Sparkplugs is good");
        }

    }
}


