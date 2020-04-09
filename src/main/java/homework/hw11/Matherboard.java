package homework.hw11;

public class Matherboard {
    private Brands brand;
    private String model;
    private int usbPorts;

    public Matherboard(Brands brand, String model, int usbPorts) {
        this.brand = brand;
        this.model = model;
        this.usbPorts = usbPorts;
    }

    public void printInfo() {
        System.out.println("Matherboard brand is " + this.brand);
        System.out.println("Matherboard model is " + this.model);
        System.out.println("Matherboard has " + this.usbPorts + " USB ports");
    }
}
