package hw11;

public class Mouse {
    private Name name;

    public void setName(Name name) {
        this.name = name;
    }

    public Name getName() {
        return name;
    }

    public Mouse(Name name) {
        this.name = name;
    }

    public void printInfo() {
        System.out.println("Mouse :\n{" + "Brand = " + name.getBrand()
                            + "\n" + " Model = " + name.getModel() + '}');
        System.out.println(App.line);
    }
}