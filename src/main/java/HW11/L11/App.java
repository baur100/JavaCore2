package HW11.L11;



public class App {
    public static void main(String[] args) {

// Exercise 1
        Mouse mouse = new Mouse("Logitech");
//        mouse.printInfo();
        Keyboard kb = new Keyboard("Microsoft");
//        kb.printInfo();
        Monitor monitor = new Monitor("Samsung", "XX-20",32);
//        monitor.printInfo();
        Processor pr = new Processor("Intel","iPro8");
//        pr.printInfo();
        Motherboard mb = new Motherboard("MSI","1089");

        SysBlock sys = new SysBlock(pr,mb);
//        sys.printInfo();

        Computer dell = new Computer(monitor,sys,mouse,kb);
        dell.printInfo();


        //Exercise 2
        Breakfast br = new Breakfast(" Coffee Americano","Tuna sandwich",5.75);
        Dinner dn = new Dinner("Apple Juice","Carbonara",10.25);




    }
}
