package HW11;

public class work {

    public static void main(String[] args) {



        brands brandDevice = new brands("Logitech ", 98, "China");
        brands brandComponent = new brands("Samsung ", 81, "Korea");
        brands brandMB = new brands("ASUS ", 78, "China");
        brands branddProc = new brands("Intel ", 96, "US");

        trims trimN = new trims("office", "not so awesome", 47);
        trims trimA = new trims("Game", "AWESOME!", 100);
        //Devices
        Mouse mouse = new Mouse(brandDevice);
        Keyboard kb = new Keyboard(brandDevice);
        Monitor monitor = new Monitor(brandComponent, "LLDH32", 42);
        //System
        MotherBoard MB = new MotherBoard(brandMB,"LGA ", 4, 775, trimA);
        Processor processor = new Processor(branddProc, "LPG", 775, "8MB");
        RAM ram = new RAM(brandComponent, "DDR4", 64, trimA);
        Graphic graphic = new Graphic(brandMB, "DDR5", 8, trimA);
        HDD hdd = new HDD(brandComponent, "SSD", 1000);
        //Computer dell = new Computer(monitor,sys,mouse,kb);
        if (MB.getTrim().getName() == "Game" && graphic.getTrim().getName() == "Game"){
            SysBlock sys = new SysBlock(MB, processor, hdd, ram, graphic, trimA);
            Computer dell = new Computer(monitor,sys,mouse,kb);
            System.out.println("Trim is " + trimA.getType());
            dell.printInfo();
        } else {
            SysBlock sys = new SysBlock(MB, processor, hdd, ram, graphic, trimN);
            Computer dell = new Computer(monitor,sys,mouse,kb);
            System.out.println("Trim is " + trimN.getType());
            dell.printInfo();
        }
        int qualityIndex = (MB.getBrand().getQuality()+
                ram.getBrand().getQuality()+
                hdd.getBrand().getQuality()+
                graphic.getBrand().getQuality()+
                processor.getBrand().getQuality())/5;
        System.out.println("Total quality: " + qualityIndex);
    }
}
