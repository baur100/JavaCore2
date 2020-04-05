package hv13;

public class Traller implements Hitch,Electric {
    protected int lenght;
    protected int price;

    public Traller(int lenght, int price) {
        this.lenght = lenght;
        this.price = price;
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public void standartBallSize() {
        System.out.println("I use standart size 1.5 ball");

    }

    @Override
    public void lightStandart() {
        System.out.println("LED light");

    }
}
