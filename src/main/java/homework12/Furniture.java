package homework12;

public class Furniture {  //superclass
    protected String origin; //USA, China, Malasia
    protected String brand;   //Ashley, Ikea, WHATEVER
    protected String function; //indoor/outdoor
    protected String manufacture; //handmade/made on fabric

    public Furniture(String origin, String brand, String function, String manufacture) {
        this.origin = origin;
        this.brand = brand;
        this.function = function;
        this.manufacture = manufacture;
    }

    public String getOrigin() {
        return origin;
    }

    public String getBrand() {
        return brand;
    }

    public String getFunction() {
        return function;
    }

    public String getManufacture() {
        return manufacture;
    }
    public void printInfo() {
        System.out.println("This piece of furniture was " + manufacture + " in " + origin + " by " +
                brand + " for " + function + " use.");
    }

    @Override
    public String toString() {
        return "Furniture{" +
                "origin='" + origin + '\'' +
                ", brand='" + brand + '\'' +
                ", function='" + function + '\'' +
                ", manufacture='" + manufacture + '\'' +
                '}';
    }
}
