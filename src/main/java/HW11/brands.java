package HW11;



public class brands {
    private String name;
    private int quality;
    private String factoryLoc;

    public brands(String name, int quality, String factoryLoc) {
        this.name = name;
        this.quality = quality;
        this.factoryLoc = factoryLoc;
    }

    public brands() {}

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public int getQuality() {
        return quality;
    }

    public void setFactoryLoc(String factoryLoc) {
        this.factoryLoc = factoryLoc;
    }

    public String getFactoryLoc() {
        return factoryLoc;
    }

    @Override
    public String toString() {
        return "brands{" +
                "name='" + name + '\'' +
                ", quality=" + quality +
                ", factoryLoc='" + factoryLoc + '\'' +
                '}';
    }

    public void printInfo(){
        System.out.println("Brand = "+ name);
    }
}
