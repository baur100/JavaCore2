package Homework10;

public class BeautyRoutine {
    public String name;
    public String periodicity;
    public Double price;
    public BeautyRoutine(String name, String periodicity, Double price) {
        this.name = name;
        this.periodicity = periodicity;
        this.price = price;
    }
    public BeautyRoutine(String name, Double price){
        this.name=name;
        this.price=price;
    }
    public void printBeautyRoutine(){
        System.out.println("It is good to get "+ name + periodicity + " for $" + price+ ".");
    }
}

