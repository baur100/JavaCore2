package L10;

public class House {
    public int sq;
    public int bedroom;
    public int bathrooms;
    public String type;
    private int[] bulbs;

    public House(int s, int b, int bt, String t, int[] bulbs) {
        sq = s;
        bedroom = b;
        bathrooms = bt;
        type = t;
        this.bulbs = bulbs;
    }

    public House() {
    }

    public void printHouseInfo() {
        System.out.println(sq + " " + " " + bedroom + " " + bathrooms + " " + type + " " + bulbs.length);
    }
}
