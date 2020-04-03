package HW11;

public class Mouse {
    private String brand;

    public Mouse(String brand) {
        this.brand = brand;
    }
    public void printInfo() {
        String xx = "Mouse=" + brand;
        System.out.println(xx);
    }
}
