package HomeWork;

public class Flower {
    public String name;
    public String type;
    public String color;
    public String stems;

    public void printInfo(){
        System.out.println("Name: " + name + "type; " + type + "color: " + color + "stems; " +stems);
    }

    public void pollinate(){
        System.out.println(name + " " + "pollinates in spring.");
    }


}
