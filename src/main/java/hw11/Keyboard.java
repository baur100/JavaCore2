package hw11;

public class Keyboard {
    private String brand;
    private String model;

    public Keyboard(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public Keyboard() {
    }
    public void printInfo(){
        System.out.println("Keyboard:  Brand "+brand+", Model "+model );
    }
}
