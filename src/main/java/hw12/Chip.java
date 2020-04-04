package hw12;

public class Chip extends Electronics{
    private String speed;
    private String wifi;

    public Chip(String brand, String model, String speed, String wifi) {
        super(brand, model, Chip.class.getSimpleName());
        this.speed = speed;
        this.wifi = wifi;
    }

    public String getSpeed() {
        return speed;
    }

    public String getWifi() {
        return wifi;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public void setWifi(String wifi) {
        this.wifi = wifi;
    }
}
