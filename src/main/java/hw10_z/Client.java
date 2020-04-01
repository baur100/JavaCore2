package hw10_z;

public class Client {
    private String name;
    private String lastName;
    private int age;
    private String company;

    public Client(String lastName, String company) {
        this.lastName = lastName;
        this.company = company;
    }

    public Client(String name, String lastName, int age, String company) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.company = company;


    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCompany() {
        return company;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {

    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Client() {
    }

    ;

    public void printClass() {
        System.out.println(name + " " + lastName + " who is " + age + " years old works in " + company);
    }

}
