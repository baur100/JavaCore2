package HW11_Person;

public class Name {
    private String name;
    private String lastName;

    public Name(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public void printPersonName(){
        System.out.println(name+" "+lastName);
    }
}
