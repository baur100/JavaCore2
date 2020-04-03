package HW11;

public class Computer {
    private Monitor monitor;
    private Sysblock sysblock;
    private Mouse mouse;
    private Keyboard keyboard;

    public Computer(Monitor monitor, Sysblock sysblock, Mouse mouse, Keyboard keyboard) {
        this.monitor = monitor;
        this.sysblock = sysblock;
        this.mouse = mouse;
        this.keyboard = keyboard;
    }

    public Sysblock getSysblock() {
        return sysblock;
    }

    public void printInfo(){
        monitor.printInfo();
        keyboard.printInfo();
        mouse.printInfo();
        sysblock.printInfo();
    }
}
