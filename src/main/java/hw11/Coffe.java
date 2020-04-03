package hw11;

public class Coffe {
    private String brand;
    private String kind;

    public Coffe(String brand, String kind) {
        this.brand = brand;
        this.kind = kind;
    }
    public void printInfo(){
        System.out.println(brand+kind+" coffe");
    }
}
