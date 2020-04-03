package hw_11_part1;

public class Computer {
    private Monitor monitor;
    private SysBlock sysBlock;
    private Mouse mouse;
    private KeyBoard keyBoard;

    public Computer(Monitor monitor, SysBlock sysBlock, Mouse mouse, KeyBoard keyBoard) {
        this.monitor = monitor;
        this.sysBlock = sysBlock;
        this.mouse = mouse;
        this.keyBoard = keyBoard;
    }

    public void printInfo() {
        monitor.printInfo();
        keyBoard.printInfo();
        mouse.printInfo();
        //sysBlock.printInfo;

    }
}
