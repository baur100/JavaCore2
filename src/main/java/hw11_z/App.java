package hw11_z;

public class App {
    public static void main(String[] args) {
//        Listening property=new Listening("House","Single Family",98001,"For sale");
//        Realtor realtor = new Realtor("Kate","Wallis",4253456781l,"123A23","Great Seattle",property);
//      realtor.getListening().printListening();
//    }
        Mouse mouse = new Mouse("Logitech");
//        mouse.printInfo();
        Keyboard kb = new Keyboard("Microsoft");
//        kb.printInfo();
        Monitor monitor = new Monitor("Samsung","XX20",32);
        monitor.printInfo();

        SysBlock sys;
        sys = new SysBlock();

        Motherboard mb = new Motherboard("8 GB DDR3L","LGA");
        Processor processor = new Processor("Intel Core M5y10","900MHz");
        System.out.println(sys.getMotherboard());

        Computer dell = new Computer(monitor,sys,mouse,kb);
        dell.printInfo();
    }
}

