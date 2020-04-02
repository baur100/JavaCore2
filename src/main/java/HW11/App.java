package HW11;

public class App {
        public static void main(String[] args) {

    Mouse mouse = new Mouse("Logitech");
    Keyboard kb = new Keyboard("Microsoft");
    Monitor monitor = new Monitor("Samsung", "XX-20",32);
    SysBlock sys = new SysBlock("Corsair","Carbide 275R");
    Motherboard mbrd = new Motherboard(" Asus", "PRIME B360M-A", 54.9);
    Processor pr = new Processor("Intel ", "Core i7-2600", 67.4);

    Computer dell = new Computer(monitor, sys, mouse, kb, mbrd, pr);
    dell.printInfo();
        }
}