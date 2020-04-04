package hw11;

public class Gate {
    private String name;
    private int number;

    public Gate(String name, int number) {
        this.name = name;
        this.number = number;
    }public Gate(){

    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Gate " +
                 name +  +
                 + number
                ;
    }
}









