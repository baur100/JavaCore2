package HW11;

public class Display {
    private String brand;
    private int razreshenie;

    public Display(String brand, int razreshenie) {
        this.brand = brand;
        this.razreshenie = razreshenie;
    }
    public void printInfo(){
        System.out.println("Display => "+brand+"-"+razreshenie);
    }
}
