package HW11.L11;

public class Dinner {
    private String juice;
    private String pasta;
    private double price;

    public Dinner(String juice, String pasta, double price) {
        this.juice = juice;
        this.pasta = pasta;
        this.price = price;
    }

    public String getPasta() {
        return pasta;
    }

    public String getJuice() {
        return juice;
    }

    public double getPrice() {
        return price;
    }
}

