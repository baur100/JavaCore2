package hw10;

public class Car {
    private String brand;
    private String model;
    private double engine;
    private double price;
    private String color;


    public Car(){}
    public Car(String Brand, String model, double engine, int price, String color){
        this.brand=brand;
        this.model=model;
        this.engine=engine;
        this.price=price;
        this.color=color;
    }
    public Car (String Brand, String model){
        this.brand=brand;
        this.model=model;

    }
    public Car(String brand, String model, int price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void printClass(){
        System.out.println("Brand : "+brand+"\nModel : "+model+"\nEngine : "+engine+"\nColor : " +color+"\n Price :  $"+price);
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getBrand() {
        return brand;
    }

    public void setModel(String model){this.model=model;}
    public String getModel(){return  model;}

    public void setEngine(double engine) {
        this.engine = engine;
    }
    public double getEngine(){return engine;}

    public void setPrice(double price) {
        this.price = price;
    }
    public double getPrice() {
        return price;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String getColor(){return color; }

    public void whatBrand(String color, String brand){
        if(brand=="Audi"&&color=="white"){
            this.brand=brand;
            System.out.println("Audi in stock");
            return;
        }
        System.out.println("out of stock");
    }
}
