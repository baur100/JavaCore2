package HW11;

public class App {
    public static void main(String[] args) {

        Mouse mouse = new Mouse("Logitech");
        //mouse.printInfo();

        Keyboard kb = new Keyboard("Microsoft");
        //kb.printInfo();

        Monitor monitor = new Monitor("Samsung", "XX-20", 32);
        //monitor.printInfo();

        Processor cpu = new Processor("AMD", "4.0Hz", 8);
        //cpu.printInfo();

        Motherboard mb = new Motherboard("Intel", "i7", "16Gb");
        // mb.printInfo();

        PowerSupply ps = new PowerSupply("500W", "5A", "120V");
        //ps.printInfo();

        SysBlock sys = new SysBlock(mb, cpu, ps);
        mb.printInfo();
        cpu.printInfo();
        ps.printInfo();

        Computer dell = new Computer(sys, monitor, kb, mouse);
        dell.printInfo();

    }
}
