package HW12;

public class Lieutenant extends Major {
    protected double iq;

    public Lieutenant(String firstname, String lastname, String rank, String gender, String city, int age, double iq) {
        super(firstname, lastname, rank, gender, city, age);
        this.iq = iq;
    }

    public double getIq() {
        return iq;
    }
}
