package hw12;

public class Coaches extends Team {
    private int experience;

    public Coaches(String name, String lastName, int yearOfBirth, String club, String nation, int experience) {
        super(name, lastName, yearOfBirth, club, nation);
        this.experience = experience;
    }

    public int getExperience() {
        return experience;
    }
}
