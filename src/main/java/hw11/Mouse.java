package hw11;

public class Mouse {
    private String brand;

    public Mouse(String brand) {
        this.brand = brand;
    }
    public Mouse() {
    }

    public void printInfo() {
        System.out.println("Brand" + brand);
    }

}
