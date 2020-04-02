package hw11;

public class NetworkAdapter {
    private Name name;
    private String wifi;
    private String speed;

    public NetworkAdapter(Name name, String wifi, String speed) {
        this.name = name;
        this.wifi = wifi;
        this.speed = speed;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Name getName() {
        return name;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public String getSpeed() {
        return speed;
    }

    public void setWifi(String wifi) {
        this.wifi = wifi;
    }

    public String getWifi() {
        return wifi;
    }

    public void printInfo() {
        System.out.println("Netword Adapter :\n{" + "Brand = " + name.getBrand() + "\n"
                + " Model = " + name.getModel() + "\n"
                + " Wifi = " + wifi + "\n"
                + " Speed = " + speed + " Mbit" + '}');
        System.out.println(App.line);
    }
}
