package Homework8;

public class Groceries {
    public String name;
    public String type;
    public Double price;
    public String characteristics;

    public void printGroc(){
        System.out.println(name + " is a "+ type + " product, it costs "+ price+ " dollars and it is " +
                characteristics + " to have it in your nutrition plan.");
    }
}
