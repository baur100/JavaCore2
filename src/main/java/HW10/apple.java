package HW10;

public class apple {
    private String founder;
    private double value;
    private String[] products;

    public apple(String founder, double value, String[] products) {
        this.founder = founder;
        this.value = value;
        this.products = products;
    }
    public apple(){}

    public void setFounder(String founder) {
        this.founder = founder;
    }

    public String getFounder() {
        return founder;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public void setProducts(String[] products) {
        this.products = products;
    }

    public String[] getProducts() {
        return products;
    }

    public void printClass(){
        System.out.print("Array elements ");
        for (String v:products) {
            System.out.print(" " + v);
        }
        System.out.println();
        System.out.println("Apple " + founder + " " + value+" bln");
        System.out.println();
    }
}
