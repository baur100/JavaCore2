package hWA11;

public class Memory {
    private String brand;
    private int capacity;

    public Memory(String brand, int capacity) {
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
        System.out.println("Memory{brand=" + brand + ", copacity=" + capacity + "}");
    }
}
