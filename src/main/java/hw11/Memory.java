package hw11;

public class Memory {
    private String brand;
    private int size;

    public Memory(String brand, int size) {
        this.brand = brand;
        this.size = size;
    }
    public void printInfo(){
        System.out.println("Memory: Brand "+brand+" Capacity "+size);
    }
}
