package hw8;

public class Address {
    public String state;
    public String city;
    public String street;
    public int building;
    public int apartment;
    public int zip;

    public void deliver(){
        System.out.println("This package will be delivered to "+ city+", "+state+" ");
    }
    public void pickup(){
        System.out.println("The driver will pick up your package at "+apartment+" - "+building+", "+street);
    }


}
