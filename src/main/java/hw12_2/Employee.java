package hw12_2;

public class Employee {
    private String name;
    private int ID;

    public Employee() {
    }

    public Employee(String name, int ID) {
        this.name = name;
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public int getID() {
        return ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void printInfo() {
        System.out.println("Employee{" +
                "name='" + name + '\'' +
                ", ID=" + ID +
                '}');
    }
}
