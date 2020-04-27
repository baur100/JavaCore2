package L10;

public class Student {
    private String name;
    private String lastname;
    private int year;

    public Student(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }

    public Student() {
    }

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return this.lastname;
    }

    public void setLastname(String l) {
        lastname = l;
    }

    public void setYear(int year) {
        if (year > 1900 && year < 2010) {
            this.year = year;
            return;
        }
        System.out.println("wrong year");
        this.year = 1900;
    }

    public int getYear() {
        return year;
    }
}
