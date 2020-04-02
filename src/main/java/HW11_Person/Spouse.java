package HW11_Person;

public class Spouse {
    private String name;
    private String lastName;

    public Spouse(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public void printSpouseName(){
        System.out.println("Spouse: "+name+" "+lastName);
    }
}
