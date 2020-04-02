package HW11_Computer;

public class Computer {
    private Monitor monitor;
    private Keyboard keyboard;
    private Mouse mouse;
    private SystBlock systBlock;

    public Computer(Monitor monitor, Keyboard keyboard, Mouse mouse, SystBlock systBlock) {
        this.monitor = monitor;
        this.keyboard = keyboard;
        this.mouse = mouse;
        this.systBlock = systBlock;
    }
    public void printComputerInfo(){
        monitor.printMonitorInfo();
        systBlock.printSBinfo();
        keyboard.printKeyboardInfo();
        mouse.printMouseInfo();
    }
}
