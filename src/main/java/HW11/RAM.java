package HW11;

public class RAM {
    private double capacity;

    public RAM(double capacity) {
        this.capacity = capacity;
    }
    public RAM (){};
    public void RAMprintInfo (){
        System.out.println("RAM Capacity: " + getCapacity());
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

}
