package hw11_Computer;

public class App {
    public static void main(String[] args){

        Keyboard kb = new Keyboard("Logitech");
        Monitor mn = new Monitor("Samsung", "A300", 32);
        Mouse mouse = new Mouse("Logitech");
        Processor pr = new Processor("IntelCore i5");
        MotherBoard mb = new MotherBoard("MSI 235");
        SystBlock sb = new SystBlock("Asus",pr ,mb,8, "black");
        Computer yourComputer = new Computer(mn, kb, mouse,sb);

        yourComputer.printComputerInfo();

    }
}
