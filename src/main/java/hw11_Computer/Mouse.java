package hw11_Computer;

public class Mouse {
    private String brand;

    public Mouse(String brand) {
        this.brand = brand;
    }

    public void printMouseInfo(){
        System.out.println("Mouse: "+brand);
    }
}
