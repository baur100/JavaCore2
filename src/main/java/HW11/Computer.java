package HW11;

public class Computer {
    private SysBlock sysBlock;
    private Motherboard motherboard;
    private Monitor monitor;
    private Keyboard keyboard;
    private Mouse mouse;

    public Computer(SysBlock sysBlock, Motherboard motherboard, Monitor monitor, Keyboard keyboard, Mouse mouse) {
        this.sysBlock = sysBlock;
        this.motherboard = motherboard;
        this.monitor = monitor;
        this.keyboard = keyboard;
        this.mouse = mouse;
    }

    public void printInfo() {
        sysBlock.printInfo();
        motherboard.printInfo();
        monitor.printInfo();
        keyboard.printInfo();
        mouse.printInfo();

    }
}
