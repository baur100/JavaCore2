package hWA11;

public class Hdd {
    private String brand;
    private int capacity;

    public Hdd(String brand, int capacity) {
        this.brand = brand;
        this.capacity = capacity;
    }

    public String getBrand() {
        return brand;
    }

    public int getCapacity() {
        return capacity;
    }
    public void printInfo(){
        System.out.println("HDD{brand=" + brand + ", capacity=" + capacity + "}");
    }
}
