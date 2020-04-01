package HW10;

public class Client {

    private String firstName;
    private String lastName;
    private int dob;

    public Client(String firstName, String lastName, int dob) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
    }

    public Client() { //constructor default
    }

    //Getter for firstName
    public String getFirstName() {
        return firstName;
    }

    //Getter for lastName;
    public String getLastName() {
        return lastName;
    }

    //Getter for DOB
    public int getdob() {
        return dob;
    }

    //Setter for firstName
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    //Setter for lastName
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //Setter forDOB
    public void setdob(int dob) {
        this.dob = dob;
    }
}
