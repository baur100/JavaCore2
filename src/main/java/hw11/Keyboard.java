package hw11;

public class Keyboard {
    private Name name;

    public void setName(Name name) {
        this.name = name;
    }

    public Name getName() {
        return name;
    }

    public Keyboard(Name name) {
        this.name = name;
    }

    public void printInfo() {
        System.out.println("Keyboard :\n{" + "Brand = " + name.getBrand() + "\n"
                            + " Model = " + name.getModel() + '}');
        System.out.println(App.line);
    }
}
