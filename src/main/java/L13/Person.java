package L13;

public class Person implements Human{
    private int age;

    public Person(int age) {
        this.age = age;
    }

    public void breathe() {
        System.out.println("I can breathe");
    }

    public void think() {
        System.out.println("I'm thinking");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
