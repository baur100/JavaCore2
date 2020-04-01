package hw10;

public class Camera {
    private String brand;
    private String model;
    private int price;

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getBrand(){return brand;};

    public void setModel(String model) {
        this.model = model;
    }
    public String getModel(){return model;}

    public void setPrice(int price) {
        this.price = price;
    }
    public int getPrice() {
        return price;
    }

    public  Camera(){};

    public void printClass() {
        System.out.println(brand + " " + model + " " + price);
    }

     public Camera(String brand, String model, int price) {
        this.brand = brand;
        this.model = model;
        this.price = price;

    }
    public void getBrand(String brand, String model,int price){
        if (brand=="Sony"||brand=="A7ii"){
            this.brand = brand;
            return ;
        }
        System.out.println("Sorry , we out of stock");
    }


}
