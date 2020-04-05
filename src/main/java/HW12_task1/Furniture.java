package HW12_task1;

public class Furniture {
    protected String manufacturer;
    protected String model;
    protected int [] dimensions;
    protected String color;

    public Furniture() {
    }

    public Furniture(String manufacturer, String model, int[] dimensions, String color) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.dimensions = dimensions;
        this.color = color;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int[] getDimensions() {
        return dimensions;
    }

    public void setDimensions(int[] dimensions) {
        this.dimensions = dimensions;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void printDimensions(){
        System.out.print("Dimensions: ");
        for(int d:dimensions){
            System.out.print(d+"x");
        }

    }
}
