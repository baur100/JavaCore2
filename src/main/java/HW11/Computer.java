package HW11;

public class Computer {
    private Monitor monitor;
    private SysBlock sysBlock;
    private Mouse mouse;
    private Keyboard keyboard;
    private Motherboard motherboard;
    private Processor processor;

    public Computer(Monitor monitor, SysBlock sysBlock, Mouse mouse, Keyboard keyboard, Motherboard motherboard, Processor processor) {
        this.monitor = monitor;
        this.processor = processor;
        this.sysBlock = sysBlock;
        this.mouse = mouse;
        this.keyboard = keyboard;
        this.motherboard = motherboard;
    }
    public void printInfo(){
        monitor.printInfo();
        keyboard.printInfo();
        mouse.printInfo();
        sysBlock.printInfo();
        motherboard.printInfo();
        processor.printInfo();

    }

}
