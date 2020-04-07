package hw11_Computer;

public class Monitor {
    private String brand;
    private String model;
    private int size;

    public Monitor(String brand, String model, int size) {
        this.brand = brand;
        this.model = model;
        this.size = size;
    }

    public void printMonitorInfo(){
        System.out.println("Monitor: "+brand+" "+model+", size - "+size+"in");
    }
}
