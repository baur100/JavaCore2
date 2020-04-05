package HW11;

public class computer {
    private HW11.monitor monitor;
    private HW11.sysBlock sysBlock;
    private HW11.mouse mouse;
    private HW11.keyboard keyboard;

    public computer(HW11.monitor monitor, HW11.sysBlock sysBlock, HW11.mouse mouse, HW11.keyboard keyboard) {
        this.monitor = monitor;
        this.sysBlock = sysBlock;
        this.mouse = mouse;
        this.keyboard = keyboard;
    }
    public void printInfo(){

        sysBlock.printInfo();
        monitor.printInfo();
        keyboard.printInfo();
        mouse.printInfo();

    }

}
