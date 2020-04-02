package hw11;

public class GPU {
    private String brand;
    private String model;
    private int RAM;
    private double price;

    public GPU(String brand, String model, int RAM, double price) {
        this.brand = brand;
        this.model = model;
        this.RAM = RAM;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getRAM() {
        return RAM;
    }

    public double getPrice() {
        return price;
    }

    public GPU() {
    }

    public void printInfo() {
        System.out.println();
        System.out.println("GPU Brand - " + this.brand +
                "\nGPU Model - " + this.model +
                "\nGPU RAM - " + this.RAM + " GB" +
                "\nGPU Price - $" + this.price);

    }

}
