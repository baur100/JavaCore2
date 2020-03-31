package hWA10;

public class Airplane {
    private String brand;
    private String model;
    private int capacity;
    private int [] numPassengers;
    private String condition;
    private int price;
    private int numHr;
    private String type;

    public Airplane(String brand, String model, int capacity, int[] numPassengers, String condition, int price, int numHr, String type) {
        this.brand = brand;
        this.model = model;
        this.capacity = capacity;
        this.numPassengers = numPassengers;
        this.condition = condition;
        this.price = price;
        this.numHr = numHr;
        this.type = type;
    }


    public Airplane() {

    }

    public String getType() {
        return type;
    }

    public int getPrice() {
        return price;
    }

    public String getCondition() {
        return condition;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getNumHr() {
        return numHr;
    }

    public int[] getNumPassengers() {
        return numPassengers;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setNumHr(int numHr) {
        if (numHr > 0 && numHr < 18000){
            this.numHr = numHr;
        return;
    }
     System.out.println("wrong numbers of hr");
        this.numHr=0;
    }

    public void setNumPassengers(int[] numPassengers) {
        this.numPassengers = numPassengers;
    }

    public void printInfo(){
        for(int x: numPassengers){
            System.out.println("Airplane: "+brand+", model:"+model+", Type: "+type+", condition: "+condition +"\nnumber of passengers is "+x);}
    }
}
