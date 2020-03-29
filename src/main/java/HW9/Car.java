package HW9;

public class Car {
    public String brand;
    public String model;
    public String color;
    public int year;
    public int price;

    public void sell(){
        System.out.println("\tBrand -> "+brand+"\n\tModel -> "+model+"\n\tColor -> "+color+"\n\tyear -> "
                +year+"\n\tprice ->"+" o.b.o "+price+"$");
    }
}
