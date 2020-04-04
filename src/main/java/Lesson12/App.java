package Lesson12;

public class App {
    public static void main(String[] args) {
        Address a1 = new Address();
        Person person = new Person("John", "Hopkins", 1950, "male", a1);

        Address a2 = new Address();
        Student student = new Student("Samuel", "Jakson", 1960, "male", a2, "Match", "MBA");

        Address a3 = new Address();
        Teacher tacher = new Teacher("Patricia", "Lee", 1980, "female", a3, "Biology");

        GraduatedStudent st = new GraduatedStudent("Mik", "Wei", 1990, "male", a1, "History", "MBA");

        System.out.println(student.getName());

        Pug poppy = new Pug("poppy", "blue");
        poppy.bark();

        Chau prince = new Chau("prince", 50);
        prince.bark();

    }
}
