package Homework11;

public class App {
    public static void main(String[] args) {
        Occupation job = new Occupation("Actress", "Bachelor of Arts", "Entertainment");
        Pet pet = new Pet("cat", "indoor");
        Person lily = new Person("Lily", 25, job, pet);

//        System.out.println(lily.getOccupation().toString());
//        System.out.println(lily.getPet().toString());
        lily.printPerson();
        System.out.println(lily.getOccupation().toString());

        System.out.println( );

        Occupation job1=new Occupation("Dentist", "Master degree","Medicine");
        Pet dog = new Pet("Dog", "indoor");
        Person adam = new Person("Adam", 28, job1, dog);

        adam.printPerson();
        System.out.println(adam.getPet().toString());

        Mouse mouse = new Mouse("Logitech");
        Speakers speakers= new Speakers("Logitech", 10);
        Keyboard kboard= new Keyboard("'Logithech", "english");
        Monitor monitor=new Monitor("Dell", "XT23",21 );
        Systemblock sblock= new Systemblock("Dell", "Intel Core i5", 16);

        Computer dell = new Computer(monitor, sblock, kboard, mouse, speakers);
        dell.printInfo();
        }
    }

