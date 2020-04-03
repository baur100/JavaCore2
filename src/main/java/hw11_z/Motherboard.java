package hw11_z;

public class Motherboard {
    private String brand;

    public Motherboard(String brand) {
        this.brand = brand;
    }

//    public void printInfo(){
//        String motherboard= "RAM = " + ram + ", Processor Socket = " + processorSocket+'}';
//        System.out.println(motherboard);
//    }


    public String getBrand() { return brand;
    }
    public void printInfo(){
        System.out.println("Motherboard = "+brand);
    }


}
