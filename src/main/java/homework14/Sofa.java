package homework14;

public class Sofa extends Furniture {
    private String type;//sleeper sofa/ daybed/ futon /recliner
    private int price;

    public Sofa(String origin, String brand, String function, String manufacture, String type, int price) {
        super(origin, brand, function, manufacture);
        this.type = type;
        this.price = price;
    }
    public String getType() {
        return type;
    }
    public int getPrice() {
        return price;
    }
    public void getInfo(){
        System.out.println("This " + type + "cost " + price+"." );
    }
}
