package Lesson10;

public class Boat {
    public int lenght;
    public String name;
    public String owner;
    public int regNumber;

    public Boat(int lenght, String name, String owner) {
        this.lenght = lenght;
        this.name = name;
        this.owner = owner;

    }

    public Boat(int lenght) {
        this.lenght = lenght;
    }

    public Boat(int l, String o) {
        this.lenght = 1;
        owner = o;
    }

    public Boat(String owner) {
        this.owner = owner;
    }

    public void printName() {
        if (name == null) {
            System.out.println("no defined");
            return;
        }
        System.out.println(name);

    }
}