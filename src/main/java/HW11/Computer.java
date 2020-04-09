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

    public Computer() {
    }

    public void printInfo () {
       monitor.printInfo();
       sysblock.printInfo();
       mouse.printInfo();
       keyboard.printInfo();
    }

}






