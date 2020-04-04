package hw11;

public class Work {
    public static void main(String[] args) {
        Mouse mouse = new Mouse("Logitech");
//        mouse.printInfo();
        Keyboard kb = new Keyboard("Microsoft");
//        kb.printInfo();
        Monitor monitor = new Monitor("Samsung", "XX-20",32);
//        monitor.printInfo();
        Motherboard motherboard = new Motherboard("ASUS", "Z-370");
        Processor processor = new Processor("AMD", "Ryzor 7", 4.3);
        SysBlock sys = new SysBlock(motherboard, processor);
        Computer dell = new Computer(monitor,sys,mouse,kb);
        dell.printInfo();
        System.out.println();

        Dress dress = new Dress("coctail", "red", 4, 80);
        Shoes shoes = new Shoes("Nine West", "black", 45);
        Bag bag = new Bag("Coach", "black", 60);
        Outfit party = new Outfit (dress, shoes, bag);
        party.printInfo();

    }

}

