package hw11;

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

    public Monitor getMonitor() {
        return monitor;
    }

    public SysBlock getSysBlock() {
        return sysBlock;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void printInfo(){
        monitor.printInfo();
        keyboard.printInfo();
        mouse.printInfo();
       sysBlock.printInfo();

    }

}
