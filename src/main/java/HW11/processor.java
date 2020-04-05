package HW11;

public class processor {
    private brands brand;
    private String socketName;
    private int socketNum;
    private String cache;

    public processor(brands brand, String socketName, int socketNum, String cache) {
        this.brand = brand;
        this.socketName = socketName;
        this.socketNum = socketNum;
        this.cache = cache;
    }
    public processor(){}

    public void setBrand(brands brand) {
        this.brand = brand;
    }

    public brands getBrand() {
        return brand;
    }

    public void setSocketName(String socketName) {
        this.socketName = socketName;
    }

    public String getSocketName() {
        return socketName;
    }


    public void setSocketNum(int socketNum) {
        this.socketNum = socketNum;
    }

    public int getSocketNum() {
        return socketNum;
    }

    public void setTrim(String trim) {
        this.cache = trim;
    }

    public String getTrim() {
        return cache;
    }
    public void printInfo(){
        System.out.println("Processor = "+ brand);
    }
}
