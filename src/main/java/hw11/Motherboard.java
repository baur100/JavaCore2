package hw11;

public class Motherboard {
    private String brand;
    private String model;
    private String  chipset;
    private int maxMemory;
    private String memSlots;

    public Motherboard(String brand, String model, String chipset, int maxMemory, String memSlots) {
        this.brand = brand;
        this.model = model;
        this.chipset = chipset;
        this.maxMemory = maxMemory;
        this.memSlots = memSlots;
    }
    public void printInfo(){
        System.out.println("Motherboard: Brand "+brand+" Model "+model+" Chipset " +chipset+" Maximum Memory Supported "+maxMemory+"GB"+" Number of Memory Slots"+memSlots);
    }
}
