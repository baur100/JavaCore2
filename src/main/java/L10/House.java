package L10;

public class House {
    public int sq;
    public int bedroom;
    public int bathrooms;
    public String type;

    public House(int s, int b, int bt, String t){
        sq=s;
        bedroom=b;
        bathrooms=bt;
        type=t;
    }
    public House(){}

    public void printHouseInfo(){
        System.out.println(sq+" "+ " " +bedroom+" "+ bathrooms+" "+type);
    }
}
