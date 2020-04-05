package homework12;

public class Desk extends Furniture {
    private String material; //wood, plastic, glass
    private String purpose;// patio, dining, work

    public Desk(String origin, String brand, String function, String manufacture,
                String material, String purpose) {
        super(origin, brand, function, manufacture);
        this.material = material;
        this.purpose = purpose;
    }

    public String getMaterial() {
        return material;
    }

    public String getPurpose() {
        return purpose;
    }

    @Override
    public String toString() {
        return "Desk{" +
                "material='" + material + '\'' +
                ", purpose='" + purpose + '\'' +
                '}';
    }
}
