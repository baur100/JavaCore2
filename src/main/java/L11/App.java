package L11;

public class App {
    public static void main(String[] args) {
        Address homeAddress = new Address("158 Broadway", "New York", 10016, "NY");


        Name andrew = new Name("Andrew", "Dowson");
        Person ad = new Person(andrew, homeAddress);
        Name nm = ad.getName();
        String l = nm.getLastName();
        String ln = ad.getName().getLastName();
        System.out.println(ln);


//
//        andrew.getAddress().printAddress();
//        Vihecles vih = new Vihecles();
//
//        Farm farm = new Farm(homeAddress,vih,andrew);
//
//        Address studentAddress = new Address("154 Baden Pl", "Brooklyn",23598,"NY");
//        Student maria = new Student("Maria", "Shi", studentAddress,154154154,"Math");

        Mouse mouse = new Mouse("Logitech");
//        mouse.printInfo();
        Keyboard kb = new Keyboard("Microsoft");
//        kb.printInfo();
        Monitor monitor = new Monitor("Samsung", "XX-20", 32);
//        monitor.printInfo();
        // TODO Create class Motherboard and Processor and add them to SysBlock, add to constructor
        SysBlock sys = new SysBlock();

        Computer dell = new Computer(monitor, sys, mouse, kb);
        dell.printInfo();
        String xx = new String("gg");


    }
}
