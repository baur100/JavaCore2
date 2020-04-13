package hw16_1;

public class Medicines {
    private String med;

    public Medicines(String med) {
        this.med = med;
    }

    public String getMed() {
        return med;
    }

    public void setMed(String med) {
        this.med = med;
    }


    public String toString() {
        return "Medicines: " + med;
    }
}
