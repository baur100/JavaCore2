package hw11;



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
        SysBlock sysBlock = new SysBlock(motherboard, memory, processor, harddrive);
        Computer dell=new Computer(sysBlock,keyboard,monitor,mouse);
        dell.printInfo();

        System.out.println("*****************************************************");
        Tea tea1 = new Tea("Hot"," brekfast");
        Tea tea2=new Tea("cold","black");
        Coffe coffe1= new Coffe ("Arabica","medium");
        Coffe coffe2=new Coffe("Brasilian", " dark");
        Drinks drink=new Drinks(tea1,coffe2);
        drink.printInfo();

    }
}
