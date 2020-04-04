package HW11;

public class Computer {
    private SysBlock sysBlock;
    private Monitor monitor;
    private Keyboard keyboard;
    private Mouse mouse;

    public Computer(SysBlock sysBlock, Monitor monitor, Keyboard keyboard, Mouse mouse) {
        this.sysBlock = sysBlock;
        this.monitor = monitor;
        this.keyboard = keyboard;
        this.mouse = mouse;
    }

    public void printInfo() {
        monitor.printInfo();
        keyboard.printInfo();
        mouse.printInfo();
        //sysBlock.printInfo();
    }
}
