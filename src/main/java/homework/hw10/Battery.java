package homework.hw10;

public class Battery {
    private String make;
    private int charge;
    private int weight;

    public Battery() {
    }

    public Battery(String make, int charge, int weight) {
        this.make = make;
        this.charge = charge;
        this.weight = weight;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getCharge() {
        return charge;
    }

    public void setCharge(int charge) {
        this.charge = charge;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void chargeBattery() {
        if (this.charge >= 100) {
            System.out.println("Battery is good");
        } else {
            this.charge = 100;
            System.out.println("Battery is charged");
        }
    }

    public void printInfo() {
        System.out.println();
        System.out.println("Battery make: " + this.make);
        System.out.println("Battery weight: " + this.weight);
        if (this.charge >= 100) {
            System.out.println("Battery is good");
            return;
        }
        System.out.println("Battery charge is: "+this.charge+" %");
    }
}
