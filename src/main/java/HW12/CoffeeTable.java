package HW12;

public class CoffeeTable extends Table {

    private String woodpazl;



    public CoffeeTable(String shape, String color, int size, String woodpazl) {
        super(shape, color, size);
        this.woodpazl = woodpazl;
    }
    public void CoffeeTableprintInfo () {
        String cc = ("Coffee table shape: " + getShape() + ". Coffee table color: " + getColor() + ". Coffee table size: "
                     + getSize() + ". Coffee Table woodpazl color: " + getWoodpazl());
        System.out.println(cc);
    }

    public String getWoodpazl() {
        return woodpazl;
    }

    public void setWoodpazl(String woodpazl) {
        this.woodpazl = woodpazl;
    }
}
