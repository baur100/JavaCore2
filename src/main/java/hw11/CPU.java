package hw11;

public class CPU {
    private String brand;
    private String model;
    private double baseFrequency;
    private int cores;
    private int threads;
    private double price;


    public CPU() {
    }

    public CPU(String brand, String model, double baseFrequency, int cores, int threads, double price) {
        this.brand = brand;
        this.model = model;
        this.baseFrequency = baseFrequency;
        this.cores = cores;
        this.threads = threads;
        this.price = price;
    }

    public void printInfo() {
        System.out.println();
        System.out.println("CPU Brand - " + this.brand +
                "\nCPU Model - " + this.model +
                "\nCPU Base Frequency - " + baseFrequency + " Ghz" +
                "\nCPU # of Cores - " + cores +
                "\nCPU # of Threads - " + threads +
                "\nCPU Price - $" + price);

    }
}
