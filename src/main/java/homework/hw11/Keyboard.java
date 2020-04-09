package homework.hw11;

public class Keyboard {
    private Brands brand;
    private boolean wireless;

    public Keyboard(Brands brand, boolean wireless) {
        this.brand = brand;
        this.wireless = wireless;
    }

    public void printInfo() {
        System.out.println("---Keyboard info---");
        System.out.println("Keyboard brand " + this.brand.toString());
        if (this.wireless == true) {
            System.out.println("This is wireless keyboard");
        } else {
            System.out.println("This is wired keyboard");
        }
    }
}
