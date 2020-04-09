package HW11;

public class App {


    public static void main(String[] args) {


        Monitor monitor = new Monitor("LG", "SP", 13);
//        monitor.printInfo();


        MotherBlock motherBlock = new MotherBlock("Intel", "i7");
//        motherBlock.printInfo();

        RAM ram = new RAM(8);
//        ram.printInfo();

        Processor processor = new Processor("Dell", 16);
//        processor.printInfo();

        Keyboard keyboard = new Keyboard("Logitech");
//        keyboard.printInfo();

        Mouse mouse =new Mouse("LogitechBlack");
//        mouse.printInfo();


        Sysblock sysblock = new Sysblock (processor, motherBlock, ram);
//        sysblock.printInfo();


        Computer dell = new Computer(monitor,sysblock, mouse,keyboard);
//        dell.printInfo();

        dell.printInfo();


    }
}
