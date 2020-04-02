package hw11_z;

public class Computer {
    private Monitor monitor;
    private SysBlock sysBlock;
    private Mouse mouse;
    private Keyboard keyboard;

    public Computer(Monitor monitor, SysBlock sysBlock, Mouse mouse, Keyboard kb) {
        this.monitor = monitor;
        this.sysBlock = sysBlock;
        this.mouse = mouse;
        this.keyboard = kb;
    }
    public void printInfo(){
        monitor.printInfo();
        keyboard.printInfo();
        mouse.printInfo();
//        sysBlock.printInfo();


    }
}
