package myLesson10;

public class Boat {
    public int length;
    public String boatName;
    public String owner;
    public int regNumber;

    public Boat(int length, String boatName, String owner) {
        this.length = length;
        this.boatName = boatName;
        this.owner = owner;
    }

    public Boat(int length) {
        this.length = length;
    }

    public Boat(int length, String owner) {
        this.length = length;
        this.owner = owner;
    }

    public Boat(String owner) {
        this.owner = owner;
    }

    public void printName() {
        if (boatName == null) {
            System.out.println("No name defined");
            return;
        }
        System.out.println(boatName);
    }
}
