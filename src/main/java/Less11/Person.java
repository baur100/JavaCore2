package Less11;

public class Person {
    private String name;
    private String lastname;
    private Address address;

    public Person(String name, String lastname, Address haddress) {
    }

    public String getName() {
        return name;
    }
    public String getLastname() {
        return lastname;
    }
    public Address getAdress() {
        return address;
    }
    public void printPerson(){
        System.out.println(name + " "+ lastname+" "+ address);
    }
}
