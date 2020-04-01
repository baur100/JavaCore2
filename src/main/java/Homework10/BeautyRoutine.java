package Homework10;

public class BeautyRoutine {
    private String name;
    private String periodicity;
    private Double price;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getPeriodicity(){
        return periodicity;
    }
    public void setPeriodicity(String periodicity){
        this.periodicity=periodicity;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    public BeautyRoutine(){}

    public BeautyRoutine(String name, String periodicity, Double price) {
        this.name = name;
        this.periodicity = periodicity;
        this.price = price;
    }

    public BeautyRoutine(String manicure, double v){
        this.name=name;
        this.price=price;
    }
    public void printBeautyRoutine(){
        System.out.println("It is good to get "+ name + " " + periodicity + " for $" + price+ ".");
    }

}

