package hw9;

public class Computer {
    public String brand;
    public String CPU;
    public int RAM;
    public int storage;
    public int externalGPU;
    public int internalGPU;

    public void printInfo() {
        System.out.println("\tBrand - " + brand +
                "\n\tCPU Model - " + CPU +
                "\n\tRAM GB - " + RAM +
                "\n\tStorage GB- " + storage +
                "\n\tExternal GPU GB - " + externalGPU +
                "\n\tInternal GPU GB - " + internalGPU);
    }
}
