package homework.hw11;


public class Processor {
    private Brands brand;
    private String model;
    private double frequency;
    private int cores;

    public Processor(Brands brand, String model, double frequency, int cores) {
        this.brand = brand;
        this.model = model;
        this.frequency = frequency;
        this.cores = cores;
    }

    public void printInfo() {
        System.out.println("Processor brand is " + this.brand.toString());
        System.out.println("Processor model is " + this.model);
        System.out.println("Processor has " + this.frequency + " GHz");
        System.out.println("Processor has " + this.cores + " cores");
    }
}
