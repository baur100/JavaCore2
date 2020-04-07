package HW14;

public class Lion extends Carnivores {
    private String size;
    private String name;

    public Lion(String food, String size, String name) {
        super(food);
        this.size = size;
        this.name = name;
    }


    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void food() {

    }

    @Override
    public void warmblood() {

    }

    @Override
    public void brain() {

    }

    @Override
    public void nerves() {

    }

    @Override
    public void touch() {

    }

    @Override
    public void breathe() {
        System.out.println("i can breath,HA-HA");
    }

    @Override
    public void death() {

    }

    @Override
    public void breed() {

    }

    @Override
    public void eat() {

    }
}
