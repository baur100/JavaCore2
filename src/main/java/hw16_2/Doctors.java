package hw16_2;

import java.util.ArrayList;
import java.util.List;

public class Doctors {
    private String name;
    private Positions position;

    public Doctors(String name, Positions position) {
        this.name = name;
        this.position = position;
    }
    List<Doctors> doctors = new ArrayList<Doctors>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Positions getPosition() {
        return position;
    }

    public void setPosition(Positions position) {
        this.position = position;
    }
    public void printInfoDoc() {
        System.out.println("Doctor " + name + " is " + position);
    }
}
