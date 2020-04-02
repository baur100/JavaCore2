package hw11;

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
}
