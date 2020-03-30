package hw9;

public class Student {
    public String firstName;
    public String lastName;
    public String email;
    public String phoneNumber;
    public String state;

    public void printInfo() {
        System.out.println("\tFirst name - " + firstName +
                "\n\tLast name - " + lastName +
                "\n\tEmail - " + email +
                "\n\tPhone number - " + phoneNumber +
                "\n\tState - " + state);
    }
}