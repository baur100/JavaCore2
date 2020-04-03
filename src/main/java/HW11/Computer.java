package HW11;

public class Computer {
    private SysBlock sysBlock;
    private Motherboard motherboard;
    private Monitor monitor;
    private Keyboard keyboard;
    private Mouse mouse;
    private PowerSupply powersupply;

    public Computer(SysBlock sysBlock, Motherboard motherboard, Monitor monitor, Keyboard keyboard, Mouse mouse,
                    PowerSupply powersupply) {
        this.sysBlock = sysBlock;
        this.motherboard = motherboard;
        this.monitor = monitor;
        this.keyboard = keyboard;
        this.mouse = mouse;
        this.powersupply = powersupply;
    }

    public void printInfo() {
        motherboard.printInfo();
        monitor.printInfo();
        keyboard.printInfo();
        mouse.printInfo();
        powersupply.printInfo();
    }
}
