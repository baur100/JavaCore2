package hw_13;

public class Child1 extends Parents implements Activity{

    private int grade;

    public Child1(String name, Address address, int age, int grade) {
        super(name,address,age);
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public Address getAddress() {
        return super.getAddress();
    }

    @Override
    public void biking() {
        System.out.println(name + " likes to bike");
    }

    @Override
    public void takingWalk() {
        System.out.println();

    }
}
