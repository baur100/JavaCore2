package Lesson10;

public class Coach {
    private String name;
    private String lastName;
    private String sport;

    public Coach(String name, String lastName, String sport) {
        this.name = name;
        this.lastName = lastName;
        this.sport = sport;
    }

    public Coach() {
    }

    public Coach(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return name;
    }

    public String getSport() {
        return sport;
    }

    public void setLastName(String lastName) {
        if (lastName.length() < 2) {
            System.out.println("wrong lastname");
            this.lastName = "00";
            return;
        }
        this.lastName = lastName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }
}