package HW11;

public class MotherBoard {
    private brands brand;
    private String socketName;
    private int ramGB;
    private int socketNum;
    private trims trim;

    public MotherBoard(brands brand, String socketName, int ramGB, int socketNum, trims trim) {
        this.brand = brand;
        this.socketName = socketName;
        this.ramGB = ramGB;
        this.socketNum = socketNum;
        this.trim = trim;
    }
    public MotherBoard(){}

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

    public void setRamGB(int ramGB) {
        this.ramGB = ramGB;
    }

    public int getRamGB() {
        return ramGB;
    }

    public void setSocketNum(int socketNum) {
        this.socketNum = socketNum;
    }

    public int getSocketNum() {
        return socketNum;
    }

    public void setTrim(trims trim) {
        this.trim = trim;
    }

    public trims getTrim() {
        return trim;
    }
    public void printInfo(){
        System.out.println("MB = "+ brand);
    }

}
