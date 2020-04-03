package HW11;

public class Adrress {
    private String street;
    private String town;
    private int zip;
    private String state;

    public Adrress(String street, String town, int zip, String state) {
        this.street = street;
        this.town = town;
        this.zip = zip;
        this.state = state;
    }

    @Override
    public String toString() {
        return "Adrress{" +
                "street='" + street + '\'' +
                ", town='" + town + '\'' +
                ", zip=" + zip +
                ", state='" + state + '\'' +
                '}';
    }
}
