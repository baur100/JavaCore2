package HW12;

public final class Soldier extends Lieutenant {
    protected int militaryID;

    public Soldier(String firstname, String lastname, String rank, String gender, String city, int age, double iq, int militaryID) {
        super(firstname, lastname, rank, gender, city, age, iq);
        this.militaryID = militaryID;
    }

    public int getMilitaryID() {
        return militaryID;
    }
}
