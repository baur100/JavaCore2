package hWA12;

public class Motor{
    private int hPw;
    private String motorType;
    private String brand;

    public Motor(int hPw, String motorType, String brand) {
        this.hPw = hPw;
        this.motorType = motorType;
        this.brand = brand;
    }

    public int gethPw() {
        return hPw;
    }

    public String getMotorType() {
        return motorType;
    }

    public String getBrand() {
        return brand;
    }
    public String toString(){
        return "Motor "+brand+" with "+hPw+" horse Powers \ntype of motor: "+motorType+".";
    }
}
