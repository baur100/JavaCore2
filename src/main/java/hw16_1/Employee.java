package hw16_1;

public class Employee {
    private String firstName;
    private String lastName;
    private String position;

    public Employee(String firstName, String lastName, String position) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPosition() {
        return position;
    }

    public String employee() {
        return(firstName + " " + lastName + ", " + position);
    }
}
