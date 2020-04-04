package homework11;

//Заполните содержимым классы Monitor, Keyboard, Mouse, SysBlock
//Создайте как минимум 2 новых классса Processor, Motherboard fields in SysBlock
//dell.prinInfo() - will print info about EVERYTHING
//Содайте 2 новых класса и сделайте их полями в 3м

public class Computer {
    private Sysblock sysblock;
    private Mouse mouse;
    private Monitor monitor;
    private Keyboard keyboard;


//   Constructor

    public Computer(Sysblock sysblock, Mouse mouse, Monitor monitor, Keyboard keyboard){
        this.mouse = mouse;
        this.sysblock=sysblock;
        this.monitor=monitor;
        this.keyboard=keyboard;

    }

//    public Computer() {
//
//    }


    public void printInfo() {
        monitor.printInfo();
        keyboard.printInfo();
        mouse.printInfo();
        sysblock.printInfo();
    }
}
