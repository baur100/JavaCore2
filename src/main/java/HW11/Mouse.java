package HW11;

public class Mouse {
    private String brand;


    public Mouse(String brand) {
        this.brand = brand;
    }

    public void printInfo() {
        System.out.println("Mouse brand: " + brand);
    }


    public String getBrand() {
        return brand;
    }
}


