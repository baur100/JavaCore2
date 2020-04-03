package hw11;

public class Computer {
    private SysBlock sysBlock;
    private Keyboard keyboard;
    private Monitor monitor;
    private Mouse mouse;

    public Computer(Keyboard keyboard, Monitor monitor, Mouse mouse) {
        this.keyboard = keyboard;
        this.monitor = monitor;
        this.mouse = mouse;
    }

    public Computer(SysBlock sysBlock, Keyboard keyboard, Monitor monitor, Mouse mouse) {
        this.sysBlock = sysBlock;
        this.keyboard = keyboard;
        this.monitor = monitor;
        this.mouse = mouse;
    }
    public void printInfo(){
        System.out.println("My computer:");
        sysBlock.printInfo();
        keyboard.printInfo();
        monitor.printInfo();
        mouse.printInfo();
    }
}
