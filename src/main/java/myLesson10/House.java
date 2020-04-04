package myLesson10;

public class House {
    public int square;
    public int bedroom;
    public int bathroom;
    public String type;
    private int[] bulbs;

    public House(int s, int b, int bt, String t, int[] bulbs) {
        square = s;
        bedroom = b;
        bathroom = bt;
        type = t;
        this.bulbs = bulbs;
    }

    public House() {
    }

    public void printHouseInfo() {
        System.out.println(square + " " + bedroom + " " + bedroom + " " + type + " " + bulbs.length);
    }
}
