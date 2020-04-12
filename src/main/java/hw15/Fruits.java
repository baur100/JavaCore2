package hw15;


public class Fruits {
    String name, supermarket;
    int itemCode, amount;

    public Fruits(String name, String supermarket, int itemCode, int amount) {
        this.name = name;
        this.supermarket = supermarket;
        this.itemCode = itemCode;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Fruits{" +
                "name='" + name + '\'' +
                ", supermarket='" + supermarket + '\'' +
                ", itemCode=" + itemCode +
                ", amount=" + amount +
                '}';
    }
}



