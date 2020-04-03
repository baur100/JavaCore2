package hw11;

import L11.SysBlock;

public class App {
    public static void main(String[] args) {


        Keyboard keyboard = new Keyboard("Dell", "KM15");
        keyboard.printInfo();
        Monitor monitor = new Monitor("Asus", "SD22", 27);
        monitor.printInfo();
        Mouse mouse = new Mouse("Mouse: Logitach");
        mouse.printInfo();
        Motherboard motherboard= new Motherboard("ASRock","B450M","AMD",64,"4×288pin");
        Harddrive  harddrive= new Harddrive("Seagate","64","SATA 6.0 Gb/s");
        Memory memory = new Memory("Crucial",64);
        Processor processor=new Processor("AMD","Ryzen 9 3900X",5,105,2019);

        SysBlock sysBlock = new SysBlock(motherboard,harddrive,memory,processor);




        Computer dell=new Computer(sysBlock,keyboard,monitor,mouse);
        dell.printInfo();


        }
    }

