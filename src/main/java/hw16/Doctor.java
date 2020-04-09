package hw16;

public class Doctor {
    private String name;
    private String lastName;
    private Position position;

    public Doctor(String name, String lastName, Position position) {
        this.name = name;
        this.lastName = lastName;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public Position getPosition() {
        return position;
    }

    public String getInfo() {
        return "First name: " + name + '\n'
                + "LastName: " + lastName + '\n'
                + "Position=" + position + '\n';
    }
}
