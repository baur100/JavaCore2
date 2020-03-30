package homework.hw9;

public class Engine {
    public String make;
    public double capacity;
    public int numberOfCilinders;
    public int waight;

    public boolean alternatorIsGood;
    public boolean sparkPlugsAreGood;

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


