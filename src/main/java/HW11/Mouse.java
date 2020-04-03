package HW11;

public class Mouse {
    private brands brand;

    public Mouse(brands brand) {
        this.brand = brand;
    }

    public Mouse() {
    }

    public void setBrand(brands brand) {


    }

    public brands getBrand() {
        return brand;
    }


    public void printInfo(){
        System.out.println("Mouse "+ brand.getName());

    }
}
