package HW12;

public class Major extends General {
    protected int age;

    public Major(String firstname, String lastname, String rank, String gender, String city, int age) {
        super(firstname, lastname, rank, gender, city);
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
