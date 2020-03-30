package hw8;

public class Clothes {
    public String item;
    public String brand;
    public String color;
    public int size;
    public double price;

    public void sale(){
        System.out.println (brand+" "+ item+" is on 50% sale");
    }
    public void out(){
        System.out.println(brand+" "+item+" "+size+ " is out of stock");

    }
}

