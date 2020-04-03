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

        SysBlock sys = new SysBlock("Intel iPro7","MSI", 1024);
//        sys.printInfo();

        Computer dell = new Computer(monitor,sys,mouse,kb);
        dell.printInfo();


        //Exercise 2
        Breakfast br = new Breakfast(" Coffee Americano","Tuna sandwich",5.75);
        Dinner dn = new Dinner("Apple Juice","Carbonara",10.25);




    }
}
