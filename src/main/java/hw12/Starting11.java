package hw12;

public class Starting11 extends Players {

    private int caps;

    public int getCaps() {
        return caps;
    }

    public Starting11(String name, String lastName, int yearOfBirth, String club, String nation, String position, int caps) {
        super(name, lastName, yearOfBirth, club, nation, position);
        this.caps = caps;

    }

}

