package hw9;

public class Table {
    public String form;
    public String material;
    public String color;
    public int price;

    public void printInfo(){
        System.out.println("\nForm -> "+ form+"\nMaterial -> "+
                material + "\nColor -> "+color + "\nPrice -> "+ price);
    }

    public void in() { System.out.println(color+ " color is in stock"); }
    public void out() { System.out.println(color+ " color is not available"); }

}
