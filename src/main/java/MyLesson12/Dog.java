package MyLesson12;

public class Dog {
    protected String name;

    Dog(String name) {
        this.name = name;
    }

    public void bark() {
        System.out.println(name + " wow-wow");
    }
}
