package homework11;

public class Mouse {
    private String brand;

//    Constructor

    public Mouse(String brand) {
        this.brand = brand;
    }

// get/serer
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void printInfo(){
        System.out.println("Mouse = "+ brand);
    }
}
