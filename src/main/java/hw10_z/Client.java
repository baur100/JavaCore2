package hw10_z;

public class Client {
    private String name;
    private String lastName;
    private int age;
    private String company;

    public Client(String lastName1, String company1) {
        this.lastName = lastName1;
        this.company = company1;
    }

    public Client(String name1, String lastName, int age, String company) {
        this.name = name1;
        this.lastName = lastName;
        this.age = age;
        this.company = company;


    }

    public String getName1() {
        return name;
    }

    public String getLastName1() {
        return lastName;
    }

    public String getCompany() {
        return company;
    }

    public int getAge() {
        return age;
    }

    public void setName1(String name) {

    }

    public void setLastName1(String lastName) {
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
