package hw15;

public class Produce extends Food{
    public String store;

    public Produce(String name, int weight, String store) {
        super(name, weight);
        this.store = store;
    }
}

