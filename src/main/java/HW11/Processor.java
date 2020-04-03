package HW11;

public class Processor {
    private String brand;
    private String frequency;
    private int multicore;

    public Processor(String brand, String frequency, int multicore) {
        this.brand = brand;
        this.frequency = frequency;
        this.multicore = multicore;
    }

    public void printInfo() {
        String xx = "Processor{brand=" + brand + ", frequency=" + frequency + ", multicore=" + multicore + '}';
        System.out.println(xx);
    }
}
