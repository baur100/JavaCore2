package homework11;

public class Motherboard {
    private String brand;
    private String chipset;
    private int usbports;
    private String memory;
    private int price;

//    Contructors



    public Motherboard(String brand, String chipset, int usbports, String memory, int price) {
        this.brand = brand;
        this.chipset = chipset;
        this.usbports = usbports;
        this.memory = memory;
        this.price = price;
    }

//    Getters and Setters


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getChipset() {
        return chipset;
    }

    public void setChipset(String chipset) {
        this.chipset = chipset;
    }

    public int getUsbports() {
        return usbports;
    }

    public void setUsbports(int usbports) {
        this.usbports = usbports;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void printInfo(){
        System.out.println("Mothrboard "+brand+" "+chipset+" chipset, with "+usbports+" usbports and "+memory+ " memory ports, price= "+price);
    }

}
