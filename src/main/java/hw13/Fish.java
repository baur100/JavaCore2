package hw13;

public class Fish implements Swimable {
    protected String name;
    protected int length;
    protected double weight;

    public void swim() {
        System.out.println(name +" swim swim swim");

    }

    public String getName() {
        return name;
    }

    public int getLength() {
        return length;
    }

    public double getWeight() {
        return weight;
    }

    public Fish(String name, int length, double weight) {
        this.name = name;
        this.length = length;
        this.weight = weight;
    }

}
