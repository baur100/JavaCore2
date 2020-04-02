package hw11;

import java.util.SortedMap;

public class CustomBuild {
    private CPU cpu;
    private Motherboard motherboard;
    private GPU gpu;
    private Disk disk;
    private RAM ram;
    private Monitor monitor;
    private Keyboard keyboard;
    private Mouse mouse;

    public CustomBuild(CPU cpu, Motherboard motherboard, GPU gpu,
                       Disk disk, RAM ram, Monitor monitor, Keyboard keyboard, Mouse mouse) {
        this.cpu = cpu;
        this.motherboard = motherboard;
        this.gpu = gpu;
        this.disk = disk;
        this.ram = ram;
        this.monitor = monitor;
        this.keyboard = keyboard;
        this.mouse = mouse;
    }

    public CPU getCpu() {
        return cpu;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public GPU getGpu() {
        return gpu;
    }

    public Disk getDisk() {
        return disk;
    }

    public RAM getRam() {
        return ram;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public double totalPrice(double cpu, double motherboard, double gpu, double disk, double ram, double monitor,
                             double keyboard, double mouse) {
        double total = getCpu().getPrice() + getMotherboard().getPrice() + getGpu().getPrice() + getDisk().getPrice() +
                getRam().getPrice() + getMonitor().getPrice() + getKeyboard().getPrice() + getMouse().getPrice();
        return total;
    }

    public void printInfo() {
        System.out.println();
        System.out.println();
        System.out.println("vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv");
        System.out.println("THE CUSTOM BUILD BELOW BASED ON " + getCpu().getBrand() + " " + getCpu().getModel());
        System.out.println("vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv");
        cpu.printInfo();
        motherboard.printInfo();
        gpu.printInfo();
        disk.printInfo();
        ram.printInfo();
        monitor.printInfo();
        keyboard.printInfo();
        mouse.printInfo();
        System.out.println("============================================");
        System.out.println("TOTAL PRICE FOR THIS CUSTOM BUILD IS " + totalPrice(getCpu().getPrice(),
                getMotherboard().getPrice(), getGpu().getPrice(), getDisk().getPrice(), getRam().getPrice(),
                getMonitor().getPrice(), getKeyboard().getPrice(), getMouse().getPrice()));
        System.out.println("============================================");
    }
}
