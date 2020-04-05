package hw12;

public class Team {
    protected String name;
    protected String lastName;
    protected int yearOfBirth;
    protected String club;
    protected String nation;

    public Team(String name, String lastName, int yearOfBirth, String club, String nation) {
        this.name = name;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
        this.club = club;
        this.nation = nation;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String getClub() {
        return club;
    }

    public String getNation() {
        return nation;
    }
}
