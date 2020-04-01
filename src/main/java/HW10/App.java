package HW10;

public class App {
    public static void main(String[] args) {

        Client elena = new Client();
        elena.setFirstName("Alenka");
        elena.setLastName("Petrova");
        elena.setdob(2000);

        System.out.println(elena.getdob());
        System.out.println(elena.getLastName());
        System.out.println(elena.getFirstName());

        Cat murka = new Cat();
        murka.setName("Murka");
        murka.setBreed("Siams");
        murka.setSize(25);
        murka.setAge(3);

        System.out.println(murka.getName());
        System.out.println(murka.getBreed());
        System.out.println(murka.getSize());
        System.out.println(murka.getAge());

        Dog baron = new Dog();
        baron.setName("Baron");
        baron.setBreed("Rotveiler");
        baron.setColor("Black");
        baron.setAge(9);

        System.out.println(baron.getName());
        System.out.println(baron.getBreed());
        System.out.println(baron.getColor());
        System.out.println(baron.getAge());

    }
}
