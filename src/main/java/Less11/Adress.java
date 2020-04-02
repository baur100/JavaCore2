package Less11;

public class Adress {
    private  String street;
    private  String  town;
    private int zip;
    private  String state;

    public Adress(String street, String town, int zip, String state) {
        this.street = street;
        this.town = town;
        this.zip = zip;
        this.state = state;
    }

    @Override
    public String toString() {
        return "Adress{" +
                "street='" + street + '\'' +
                ", town='" + town + '\'' +
                ", zip=" + zip +
                ", state='" + state + '\'' +
                '}';
    }
}
