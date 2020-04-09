package homework.hw11;

public class Computer {
    private Sysblock sysblock;
    private Monitor monitor;
    private Mouse mouse;
    private Keyboard keyboard;

    public Computer(Sysblock sysblock, Monitor monitor, Mouse mouse, Keyboard keyboard) {
        this.sysblock = sysblock;
        this.monitor = monitor;
        this.mouse = mouse;
        this.keyboard = keyboard;
    }

    public void printInfo(){
        System.out.println("___________COMPUTER INFO___________");
        sysblock.printInfo();
        monitor.printInfo();
        keyboard.printInfo();
        mouse.printInfo();
    }
}
