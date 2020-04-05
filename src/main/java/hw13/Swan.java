package hw13;

public class Swan implements Swimable {
    protected String name;
    protected String color;
    protected int age;


    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    public Swan(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public void swim() {
        System.out.println(name+" swim");

    }
}
