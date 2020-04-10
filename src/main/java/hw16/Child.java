package hw16;

public class Child {
    private double age;

    public Child(double age) {
        this.age = age;
    }




    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Child " +
                "age=" + age
                ;
    }
}
