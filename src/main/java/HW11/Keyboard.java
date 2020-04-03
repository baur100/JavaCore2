package HW11;

public class Keyboard {
    private brands brand;

    public Keyboard(brands brand) {
        this.brand = brand;
    }

    public Keyboard() {
    }

    public void printInfo(){

        System.out.println("Keyboard brand " + brand.getName());
    }
}
