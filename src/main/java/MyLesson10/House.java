package MyLesson10;

public class House {
    public int square;
    public int bedroom;
    public int bathroom;
    public String type;

    public House(int s, int b, int bt, String t) {
        square = s;
        bedroom = b;
        bathroom = bt;
        type = t;
    }

    public House() {
    }

    public void printHouseInfo() {
        System.out.println(square + " " + bedroom + " " + bedroom + " " + type + " ");
    }
}
