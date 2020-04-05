package homework11;

public class Work {
    public static void main(String[] args) {
        Monitor monitor = new Monitor("LG", "32323kf32", 32);
        Mouse mouse = new Mouse("Asus");
        Keyboard keyboard1 = new Keyboard("Asus");
        Motherboard motherboard1 = new Motherboard("Gigabyte", "Intel Z390", 8,
                "(4) DIMM", 255);
        Processor processor1 = new Processor("Intel", "6 cores", 9, 4400, 443);
        Sysblock sys1 = new Sysblock(processor1, motherboard1);


        Computer dell = new Computer(sys1, mouse, monitor, keyboard1);
        dell.printInfo();

    }





}
