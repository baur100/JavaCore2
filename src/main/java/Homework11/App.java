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
        }
    }

