package homewor15;

public class Bulbs {
    private String type;
    private String inOutDoor;
    private Integer lumens;


    public Bulbs() {
    }


    public Bulbs(String type, String inOutDoor, Integer lumens) {
        this.type = type;
        this.inOutDoor = inOutDoor;
        this.lumens = lumens;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getInOutDoor() {
        return inOutDoor;
    }

    public void setInOutDoor(String inOutDoor) {
        this.inOutDoor = inOutDoor;
    }

    public Integer getLumens() {
        return lumens;
    }

    public void setLumens(Integer lumens) {
        this.lumens = lumens;
    }

    @Override
    public String toString() {
        return "Bulbs{" +
                "type='" + type + '\'' +
                ", inOutDoor='" + inOutDoor + '\'' +
                ", lumens=" + lumens +
                '}';
    }
}






