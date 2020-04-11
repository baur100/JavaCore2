package myLesson10;

public class Person {
    public String firstName;
    public String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String result(int a, int b, int c) {
        return firstName + (a + b + c);
    }

    public String lastResult(int a, String b) {
        return lastName + a + b;
    }

}
