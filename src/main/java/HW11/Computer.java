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

    public Monitor getMonitor() {
        return monitor;
    }

    public Sysblock getSysblock() {
        return sysblock;
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
        sysblock.printInfo();
    }
}
