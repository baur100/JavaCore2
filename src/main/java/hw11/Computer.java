package hw11;

public class Computer {
    private Name name;
    private Sysblock sysblock;
    private Monitor monitor;
    private Keyboard keyboard;
    private Mouse mouse;

    public Computer(Name name, Sysblock sysblock, Monitor monitor, Keyboard keyboard, Mouse mouse) {
        this.name = name;
        this.sysblock = sysblock;
        this.monitor = monitor;
        this.keyboard = keyboard;
        this.mouse = mouse;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Name getName() {
        return name;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setSysblock(Sysblock sysblock) {
        this.sysblock = sysblock;
    }

    public Sysblock getSysblock() {
        return sysblock;
    }

    public void printInfo() {
        name.printInfo();
        sysblock.printInfo();
        monitor.printInfo();
        keyboard.printInfo();
        mouse.printInfo();
    }
}
