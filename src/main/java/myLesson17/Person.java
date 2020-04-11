package myLesson17;

public class Person {
    private String name;
    private String lastName;
    public static int counter;

    public Person(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Person.counter = counter;
    }
}
