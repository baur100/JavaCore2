package HW11.L11;

public class Computer {
    private Monitor monitor;
    private SysBlock sysBlock;
    private Mouse mouse;
    private Keyboard keyboard;

    public Computer(Monitor monitor, SysBlock sysBlock, Mouse mouse, Keyboard keyboard) {
        this.monitor = monitor;
        this.sysBlock = sysBlock;
        this.mouse = mouse;
        this.keyboard = keyboard;
    }
    public void printInfo(){
        monitor.printInfo();
        keyboard.printInfo();
        mouse.printInfo();
        sysBlock.printInfo();

    }

}
