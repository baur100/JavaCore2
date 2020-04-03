package hw_11_part1;

public class App {
    public static void main(String[] args) {


        Mouse mouse = new Mouse("HP");
        mouse.printInfo();
        KeyBoard kb = new KeyBoard("Asus");
        kb.printInfo();
        Monitor monitor = new Monitor("HP", "LLC", 18);
        monitor.printInfo();
        SysBlock sys = new SysBlock();


        //Computer dell = new Computer(monitor,sys,mouse, kb);
        //dell.printInfo();

    }
}
