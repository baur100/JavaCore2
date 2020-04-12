package homework16part2;

public class Doctor {
    private String name;
    private String lastname;
    private Position position;

    public Doctor(String name, String lastname, Position position) {
        this.name = name;
        this.lastname = lastname;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public Position getPosition() {
        return position;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", position=" + position +
                '}';
    }
    public void printDoctor(){
        System.out.println("Doctor "+ name+ " "+ lastname + " is a " + position+".");
    }
}
