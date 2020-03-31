package hWA10;

public class Boat {
    private String name;
    private int year;
    private int price;
    private String engine;
    private String portName;
    private double tankVolume;
    private double spead;
    private int[] numPassengers;
    private String type;

    public Boat(String name, int year, int price, String engine, String portName, double tankVolume, double spead, int[] numPassengers, String type) {
        this.name = name;
        this.year = year;
        this.price = price;
        this.engine = engine;
        this.portName = portName;
        this.tankVolume = tankVolume;
        this.spead = spead;
        this.numPassengers = numPassengers;
        this.type = type;
    }

    public Boat(String name, int year, int price, String engine, String type) {
        this.name = name;
        this.year = year;
        this.price = price;
        this.engine = engine;
        this.portName = portName;
        this.type = type;
    }

    public Boat(String name, int year, String engine, double tankVolume, double spead, int[] numPassengers, String type) {
        this.name = name;
        this.year = year;
        this.engine = engine;
        this.portName = portName;
        this.tankVolume = tankVolume;
        this.spead = spead;
        this.numPassengers = numPassengers;
        this.type = type;
    }

    public Boat() {
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public double getSpead() {
        return spead;
    }

    public double getTankVolume() {
        return tankVolume;
    }

    public int getYear() {
        return year;
    }

    public int[] getNumPassengers() {
        return numPassengers;
    }

    public String getEngine() {
        return engine;
    }

    public String getPortName() {
        return portName;
    }

    public String getType() {
        return type;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setNumPassengers(int[] nunPassengers) {
        this.numPassengers = nunPassengers;
    }

    public void setPortName(String portName) {
        this.portName = portName;
    }

    public void setSpead(double spead) {
        this.spead = spead;
    }

    public void setTankVolume(double tankVolume) {
        if (tankVolume > 300 && tankVolume < 1500) {
            this.tankVolume = tankVolume;
            return;
        }
        System.out.println("wrong size of tank");
        this.tankVolume = 300;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setYear(int year) {
        if (year > 1930 && year < 2020) {
            this.year = year;
            return;
        }
        System.out.println("wrong year");
        this.year = 2020;
    }

    public void printInfo() {
        for (int x : numPassengers) {
            System.out.println("Boat: " + name + "\nYear of construction - " + year + "\nEngine: " + engine + "\nPort: " + portName + "\nNumber of Passengers: " + x);
        }
    }
}
