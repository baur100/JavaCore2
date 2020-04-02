package Lesson11;

public class Computer {
    private Monitor monitor;
    private Sysblock sysblock;
    private Mouse mouse;
    private Keyboard keyboard;

    public Computer(Monitor monitor, Sysblock sysBlock, Mouse mouse, Keyboard keyboard) {
        this.monitor = monitor;
        this.sysblock = sysblock;
        this.mouse = mouse;
        this.keyboard = keyboard;
    }
    public void printInfo(){
        monitor.printInfo();
        keyboard.printInfo();
        mouse.printInfo();
//        sysBlock.printInfo();

    }

}