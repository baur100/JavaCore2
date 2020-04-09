package homework.hw11;

public class Mouse {
    private Brands brand;
    private boolean wireless;

    public Mouse(Brands brand, boolean wireless) {
        this.brand = brand;
        this.wireless = wireless;
    }

    public void printInfo() {
        System.out.println("---Mouse info---");
        System.out.println("Mouse brand " + this.brand.toString());
        if (this.wireless == true) {
            System.out.println("Mouse is wireless");
        } else {
            System.out.println("Mouse is wired");
        }
    }
}
