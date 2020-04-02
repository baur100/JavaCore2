package myLesson11;

public class Keyboard {
    private String brand;

    public Keyboard(String brand) {
        this.brand = brand;
    }

    public void printDevInfo() {
        System.out.println("Keyboard brand - " + brand);
    }
}
