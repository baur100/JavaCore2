package myLesson10;

public class Student {
    private String firstName;
    private String lastName;
    private int year;

    public Student() {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Getter
    public String getFirstName() {
        return firstName;
    }

    // Setter
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setYear(int year) {
        this.year = year;
        if (year > 1900 && year < 2010) {
            this.year = year;
            return;
        }
        System.out.println("Wrong year");
    }

    public int getYear() {
        return year;
    }
}
