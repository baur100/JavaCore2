package hw16p2;

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

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public String printInfo(){
        return (name + " " + lastName + ", " + position);
    }
}
