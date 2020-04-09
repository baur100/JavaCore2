package HW11;

public class RAM {
    private double capacity;

    public RAM(double capacity) {
        this.capacity = capacity;
    }
    public RAM (){};
    public void printInfo (){ String zz =("RAM Capacity: " + capacity);
    System.out.println (zz);
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

}
