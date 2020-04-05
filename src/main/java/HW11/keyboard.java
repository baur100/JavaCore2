package HW11;

public class keyboard {
    private brands brand;

    public keyboard(brands brand) {
        this.brand = brand;
    }

    public keyboard() {
    }

    public void printInfo(){

        System.out.println("Keyboard brand " + brand.getName());
    }
}
