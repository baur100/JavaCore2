package HW9;

public class Phone {
    public String brand;
    public String model;
    public String color;
    public int memory;
    public double price;
    public int weight;
    public double screenSize;

    public void ring(){
        System.out.println(brand+" "+model+" "+ "is ringing.");
    }

    public void printInfo(){
        System.out.println("Phone info: "+"\nBrand: "+brand+"\nModel: "+model+"\nColor: "+color+"\nMemory: "+memory+"Gb"+"\nWeight: "+weight+"g"+"\nScreen size: "+screenSize+"\nPrice: $"+price);
    }
}
