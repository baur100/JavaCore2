package hw_13;

public class Parents implements Activity{
    protected String name;
    protected Address address;
    protected int age;

    public Parents(String name, Address address, int age) {
        this.name = name;
        this.address =address;
        this.age =age;

    }

    public int getAge() {
        return age;
    }

    public Address getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void biking() {

    }

    @Override
    public void takingWalk() {
        System.out.println(name + " likes to go for walk");

    }
    public void printInfo(){

    }
}
