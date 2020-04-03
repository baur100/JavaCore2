package HW11;

public class App {
    public static void main(String[] args) {

        Mouse mouse = new Mouse("Logitech");
        //mouse.printInfo();

        Keyboard kb = new Keyboard("Microsoft");
        //kb.printInfo();

        Monitor monitor = new Monitor("Samsung", "XX-20", 32);
        //monitor.printInfo();

        Processor cpu = new Processor("Intel", 4.0, 8);
        //cpu.printInfo();

        Motherboard mb = new Motherboard("Sony", "i7", 16);
        // mb.printInfo();

        SysBlock sys = new SysBlock(mb, cpu);
        // mb.printInfo();
        // cpu.printInfo();

        Computer dell = new Computer(sys, mb, monitor, kb, mouse);
        dell.printInfo();
    }
}