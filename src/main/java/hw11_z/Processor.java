package hw11_z;

public class Processor {
    private String brand;
    private String cpu;

    public Processor(String brand, String cpu) {
        this.brand = brand;
        this.cpu = cpu;
    }


//}
//    public void printInfo(){
//        String processor= "Processor = " + name + ", CPU = " + cpu+'}';
//        System.out.println(processor);
//    }


    public String getBrand() {
        return brand;
    }


    public String getCpu() {
        return cpu;
    }
    public void printInfo(){
        System.out.println("Processor = "+brand + ", CPU = "+cpu);
    }
}
