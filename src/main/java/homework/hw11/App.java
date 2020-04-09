package homework.hw11;

public class App {
    public static void main(String[] args) {
        Matherboard matherboard = new Matherboard(Brands.AMD, "B450M", 6);
        Processor processor = new Processor(Brands.INTEL, "i9", 4.3,4);
        Sysblock sysblock = new Sysblock(Brands.HP, processor, matherboard);
        Monitor monitor = new Monitor(Brands.DELL, 32);
        Keyboard keyboard = new Keyboard(Brands.LOGITECH, true);
        Mouse mouse = new Mouse(Brands.LOGITECH, false);

        Computer computer = new Computer(sysblock, monitor, mouse, keyboard);
        computer.printInfo();

    }
}
