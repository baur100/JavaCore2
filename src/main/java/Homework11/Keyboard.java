package Homework11;

public class Keyboard {
    private String brand;
    private String language;

    public Keyboard(String brand, String language) {
        this.brand = brand;
        this.language = language;
    }

    public void printInfo() {
        String xx = " Keyboard: brand - " + brand + ", language - " + language + ".";
        System.out.println(xx);
    }
}
