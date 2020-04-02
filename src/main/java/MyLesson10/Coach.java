package MyLesson10;

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

    public String getName() {
        return name;
    }

    public void getLastName() {
        if (lastName.length() < 2) {
            System.out.println("Wrong last name");
            this.lastName = "0";
            return;
        }
        this.lastName = lastName;
    }

    public String getSport() {
        return sport;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }
}
