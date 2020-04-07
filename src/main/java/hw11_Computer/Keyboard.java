package hw11_Computer;

public class Keyboard {
    private String brand;

    public Keyboard(String brand) {
        this.brand = brand;
    }
    public void printKeyboardInfo(){
        System.out.println("Keyboard: "+brand);
    }
}
