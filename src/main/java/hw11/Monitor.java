package hw11;

import java.security.PrivateKey;
import java.util.PrimitiveIterator;

public class Monitor {
    private String brand;
    private String model;
    private int size;

    public Monitor(String brand, String model, int size) {
        this.brand = brand;
        this.model = model;
        this.size = size;
    }
    public void printInfo(){
        System.out.println("Monitor: Brand "+brand+", Model "+model+", Size" +size);
    }
}
