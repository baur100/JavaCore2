package HW11;

public class HDD {
    private brands brand;
    private String type;
    private int vol;

    public HDD(brands brand, String type, int vol) {
        this.brand = brand;
        this.type = type;
        this.vol = vol;
    }
    public HDD(){}

    public void setBrand(brands brand) {
        this.brand = brand;
    }

    public brands getBrand() {
        return brand;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }


    public void setVol(int vol) {
        this.vol = vol;
    }

    public int getVol() {
        return vol;
    }

    public void printInfo(){
        System.out.println("HDD = "+ brand);
    }
}
