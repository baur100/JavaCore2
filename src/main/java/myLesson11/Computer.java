package myLesson11;

public class Computer {
    private Monitor monitor;
    private SystemBlock systemBlock;
    private Mouse mouse;
    private Keyboard keyboard;

    public Computer(Monitor monitor, SystemBlock systemBlock, Mouse mouse, Keyboard keyboard) {
        this.monitor = monitor;
        this.systemBlock = systemBlock;
        this.mouse = mouse;
        this.keyboard = keyboard;
    }

    public void printDevInfo() {
        monitor.printDevInfo();
        keyboard.printDevInfo();
        mouse.printDevInfo();
//        systemBlock.printDevInfo();

    }
}
