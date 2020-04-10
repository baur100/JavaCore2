package hWA11;

public class Computer {
    private Monitor monitor;
    private SysBlock sysBlock;
    private Mouse mouse;
    private KeyBoard keyboard;

    public Computer(Monitor monitor, SysBlock sysBlock, Mouse mouse, KeyBoard keyboard) {
        this.monitor = monitor;
        this.sysBlock = sysBlock;
        this.mouse = mouse;
        this.keyboard = keyboard;
    }

    public SysBlock getSysBlock() {
        return sysBlock;
    }

    public void printInfo(){
        monitor.printInfo();
        keyboard.printInfo();
        mouse.printInfo();
        sysBlock.printInfo();

    }

}
