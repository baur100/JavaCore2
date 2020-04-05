package HW11;

public class Monitor {
    private String brand;
    private String model;
    private int d;

    public Monitor(String brand, String model, int d) {
        this.brand = brand;
        this.model = model;
        this.d = d;
    }
    public Monitor (){};

    public void MonitorprintInfo() {String xx = ("Monitor brand: "  + getBrand() + "\nMonitor model: " + getModel() + "\nMonitor diagonal: " + getD());
           System.out.println(xx);
    };

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getD() {
        return d;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setD(int d) {
        this.d = d;
    }
}
