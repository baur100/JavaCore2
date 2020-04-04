package hw12;

public class Body {
    private Head head;
    private int height;
    private int weight;

    public Body(Head head, int height, int weight) {
        this.head = head;
        this.height = height;
        this.weight = weight;
    }

    public Head getHead() {
        return head;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }
}
