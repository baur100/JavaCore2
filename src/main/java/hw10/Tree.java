package hw10;

public class Tree {
    private String name;
    private double height;
    private int years;

    public Tree(String name, double height, int years) {
        this.name = name;
        this.height = height;
        this.years = years;

    }

    public Tree(double height) {
        this.height = height;
    }

    public Tree(String name, int years) {
        this.years = years;
        this.name = name;
    }

    public void printHeight() {
        if (height == 0) {
            System.out.println("It wasn't planted");
            return;
        }
        System.out.println(height);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height > 80.0 && height < 80.5) {
            this.height = height;
            return;
        }
        System.out.println("This size is normal");
        this.height = 80.8;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }
}

