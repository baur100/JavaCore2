package homework10;

public class Cars {
    private String make;
    private String model;
    private int[] year;
    private String color;

// Constructors



    public Cars(String make, int[] year, String color){
        this.make=make;
        this.color=color;
        this.year=year;
    }

    public Cars(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public Cars(){};



    //    Setters

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int[] year) {
        this.year = year;
    }

    public void setColor(String color) {
        this.color = color;
    }

//Getters


    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int[] getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

//

    public void beep(){
        System.out.println("Машина марки "+getMake()+" и модели "+getModel()+" делает БИ-БИ");
    }

    public void printInfo() {
        System.out.println("Машина марки "+getMake()+" и модели "+getModel()+" "+getYear()+" года, "+getColor()+" цвета");

    }
public void printClass(){
    System.out.println(getMake()+" "+getModel()+" "+getColor()+" "+getYear());
}

}
