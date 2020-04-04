package Homework11;

public class Computer {
    private Monitor monitor;
    private Systemblock block;
    private Keyboard kboard;
    private Mouse mouse;
    private Speakers spkers;

    public Computer(Monitor monitor, Systemblock block, Keyboard kboard, Mouse mouse, Speakers spkers) {
        this.monitor = monitor;
        this.block = block;
        this.kboard = kboard;
        this.mouse = mouse;
        this.spkers = spkers;
    }
    public void printInfo(){
        monitor.printInfo();
        kboard.printInfo();
        mouse.printInfo();
        spkers.printInfo();
        block.printInfo();
    }
}
