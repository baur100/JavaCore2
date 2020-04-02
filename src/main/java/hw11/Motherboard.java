package hw11;

public class Motherboard {
    private Name name;
    private int usb;
    private int displayPort;
    private int pci;

    public Motherboard(Name name, int usb, int displayPort, int pci) {
        this.name = name;
        this.usb = usb;
        this.displayPort = displayPort;
        this.pci = pci;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Name getName() {
        return name;
    }

    public void setDisplayPort(int displayPort) {
        this.displayPort = displayPort;
    }

    public int getDisplayPort() {
        return displayPort;
    }

    public void setUsb(int usb) {
        this.usb = usb;
    }

    public int getUsb() {
        return usb;
    }

    public void setPci(int pci) {
        this.pci = pci;
    }

    public int getPci() {
        return pci;
    }

    public void printInfo() {
        System.out.println("Motherboard :\n{" + "Brand = " + name.getBrand() + "\n"
                            + " Model = " + name.getModel() + "\n"
                            + " UBS 3.0 = " + usb + "\n"
                            + " Display Port = " + displayPort + "\n"
                            + " PCI-e 3.0 = " + pci + '}');
        System.out.println(App.line);
    }
}
