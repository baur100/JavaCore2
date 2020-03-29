package HW9;

public class Carseat {
    public String category;
    public String brand;
    public String model;
    public double price;

    public void printInfo(){
        System.out.println("Category: "+category+" Brand: "+brand+" Model: "+model+ " Price: "+price);
        if(category=="Infant Car Seat"){
            System.out.println("Safely seats children weighing 4 up to 35 lb");
        }else{
            System.out.println("Supports children from 5-65 lb.");
        }
    }
}
