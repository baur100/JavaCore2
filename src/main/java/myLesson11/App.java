package myLesson11;

public class App {
    public static void main(String[] args) {
        Address homeAddress = new Address("158 Broadway", "Ney York", 10016, "NY");
        Person Andrew = new Person("Andrew", "Dowson", homeAddress);

        Andrew.getAddress().printAddress();
        Vehicles vehicles = new Vehicles();

        Farm farm = new Farm(homeAddress, vehicles, Andrew);

        Address studentAddress = new Address("154 Baden Pl", "Brooklyn", 10017, "NY");
        Student maria = new Student("Maria", "Shi", studentAddress, 1541515, "Math");

        Mouse mouse = new Mouse("Logitech");
        Keyboard keyboard = new Keyboard("Microsoft");
        Monitor monitor = new Monitor("Samsung", "AD50", 32);
        SystemBlock systemBlock = new SystemBlock();
        Computer dell = new Computer(monitor, systemBlock, mouse, keyboard);
        dell.printDevInfo();
    }
}
