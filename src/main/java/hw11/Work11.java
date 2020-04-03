package hw11;

public class Work11 {
    public static void main(String[] args) {
        Mouse mouse = new Mouse("Logitech");
        mouse.printInfo();

        Keyboard kb = new Keyboard("Microsoft");
        kb.printInfo();

        Monitor monitor = new Monitor("Samsung", "XX-20", 32);
        monitor.printInfo();

        SysBlock sys = new SysBlock(new Processor("Core",4.0,"VNX"), new Motherboard("Asus",128,01));
        Motherboard moth = new Motherboard("Asus", 128, 01);
        Processor pro = new Processor("Core", 4.0, " VNX");



        Computer dell = new Computer(monitor, sys, mouse, kb);
        dell.printInfo();
        String xx = new String("gg");


    }
}

