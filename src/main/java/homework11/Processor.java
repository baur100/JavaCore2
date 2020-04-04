package homework11;

public class Processor {
    private String brand;
    private String cores;
    private int cache;
    private int frequency;
    private int price;

//   Constructors

    public Processor(String brand, String cores, int cache, int frequency, int price) {
        this.brand = brand;
        this.cores = cores;
        this.cache = cache;
        this.frequency = frequency;
        this.price = price;
    }

//    Getters and Setters


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCores() {
        return cores;
    }

    public void setCores(String cores) {
        this.cores = cores;
    }

    public int getCache() {
        return cache;
    }

    public void setCache(int cache) {
        this.cache = cache;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    public void printInfo() {
        System.out.println("Processor Brand "+brand + " ," + cores + " " + cache + " mb cache " + frequency + " frequency MhZ " + price+"$ price");
    }

}

