package hWA12;

public class Boat extends Transport {
    private String boatType;

    public Boat(int price, String type, String fuel, String boatType) {
        super(price, type, fuel);
        this.boatType = boatType;
    }

    public String getBoatType() {
        return boatType;
    }
    public String toString(){
        return "Boat type:" +boatType+" it's a "+type+" type;\nPrice: "+price+"\nfuel: "+fuel;
    }
}
