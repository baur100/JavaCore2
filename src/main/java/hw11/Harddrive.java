package hw11;

public class Harddrive {
    private String brand;
    private String size;
    private String hi;

    public Harddrive(String brand, String size, String hi) {
        this.brand = brand;
        this.size = size;
        this.hi = hi;
    }
    public void  printInfo(){
        System.out.println( "Harddrive: Brand "+brand+" Digital Storage Capacity "+size+"GB"+" Hardware Interface " +hi);
    }
}
