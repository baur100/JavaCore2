package HW11;

public class RAM {
    private brands brand;
    private String ramType;
    private int ram;
    private trims trim;

    public RAM(brands brand, String ramType, int ram, trims trim) {
        this.brand = brand;
        this.ramType = ramType;
        this.ram = ram;
        this.trim = trim;
    }
    public RAM(){}

    public void setBrand(brands brand) {
        this.brand = brand;
    }

    public brands getBrand() {
        return brand;
    }

    public void setRamType(String ramType) {
        this.ramType = ramType;
    }

    public String getRamType() {
        return ramType;
    }


    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getRam() {
        return ram;
    }

    public void setTrim(trims trim) {
        this.trim = trim;
    }

    public trims getTrim() {
        return trim;
    }
    public void printInfo(){
        System.out.println("RAM = "+ brand);
    }
}
