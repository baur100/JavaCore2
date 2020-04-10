package hw16_2;

public class Doctor {
    private String name;
    private String lastName;
    private Position position;

    public Doctor(String name, String lastName, Position position) {
        this.name = name;
        this.lastName = lastName;
        this.position = position;
    }
    public String printDoctor(){
        return (name+" "+lastName+", "+position);
    }
}
