package hw11;

public class Soundcard {
    private Name name;

    public Soundcard(Name name) {
        this.name = name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Name getName() {
        return name;
    }

    public void printInfo() {
        System.out.println("Sound Card :\n{" + "Brand = " + name.getBrand() + "\n"
                + " Model = " + name.getModel() + '}');
        System.out.println(App.line);
    }
}
