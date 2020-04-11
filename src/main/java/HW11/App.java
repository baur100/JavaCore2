package HW11;

public class App {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Before i been used this computer:");
        Mouse mouse = new Mouse("Logitech");
        Keyboard kbd = new Keyboard("Microsoft");
        Monitor monitor = new Monitor("HP", "Ut-54", 62);
        Processor pr = new Processor("Dell");
        Motherboard mb = new Motherboard("Opl");
        Color cl = new Color("Red");
        Sysblock sysblock = new Sysblock(pr, mb, cl);

        Computer dell = new Computer(monitor, sysblock, mouse, kbd);
        dell.printInfo();
        System.out.println();
        System.out.println("Now im use Macbook and very happy: ");

        Serialnumber ss = new Serialnumber(1234567890);
        Display ds = new Display("Intel", 1200);
        Inshurance in = new Inshurance("Apple care");
        Memory mm = new Memory("8 GB 1600 MHz DDR3");
        Size sz = new Size("13 inch");
        Storage st = new Storage("128 gb");
        ProcessorM pm = new ProcessorM("2.6 GHz Dual-Core Intel Core i5");

        Mac mac = new Mac(ds, st, in, pm, mm, ss, sz);
        mac.printInfo();

        System.out.println();
        System.out.println("My old laptop im gonna send it to:");

        Adrress hb = new Adrress("5738 fair ave", "N.Hollywood", 91601, "CA");

        Person brian = new Person("Brian","Kukurov",hb);
        System.out.println(brian.getAddress().toString());
        Sysblock sys = new Sysblock(pr,mb,cl);
        System.out.println();
        Computer comp = new Computer(monitor,sysblock,mouse,kbd);
        comp.printInfo();
        System.out.println();
        System.out.println("try");

    }
    public void printInfoDoctors(){

    }
}