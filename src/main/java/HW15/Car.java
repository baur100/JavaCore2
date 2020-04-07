package HW15;

public class Car {
    private String brand;
    private String model;
    private int year;
    private int price;

    public Car() {
    }

    public Car(String brand, String model, int year, int price) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getPrice() {
        return price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car" +
                "\nBrand = " + brand +
                "\nBodel = " + model +
                "\nYear = " + year +
                "\nPrice = $" + price+"\n";
    }
}
