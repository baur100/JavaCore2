package Homework11;

public class Speakers {
    private String brand;
    private int power;

    public Speakers(String brand, int power) {
        this.brand = brand;
        this.power = power;
    }
    public void printInfo(){
        String xx=" Speakers: brand - "+brand + ", power - "+ power+"Watts.";
        System.out.println(xx);
    }
}
