package hw16_1;

public class Pharmacist {
    private String name;

    public Pharmacist(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String toString() {
        return "Pharmacist: " + name;
    }
}
