package HW11;

public class Keyboard {
    private String brand;

    public Keyboard(String brand) {
        this.brand = brand;
    }

    public void printInfo() {
        String xx = "Keyboard brand=" + brand;
        System.out.println(xx);
    }
}
