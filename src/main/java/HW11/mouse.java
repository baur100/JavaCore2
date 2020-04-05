package HW11;

public class mouse {
    private brands brand;

    public mouse(brands brand) {
        this.brand = brand;
    }

    public mouse() {
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
