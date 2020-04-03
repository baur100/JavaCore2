package hw11;

public class Drinks {
    private Tea tea;
    private Coffe coffe;

    public Drinks(Tea tea, Coffe coffe) {
        this.tea = tea;
        this.coffe = coffe;
    }
    public void printInfo(){
        tea.prinInfo();
        coffe.printInfo();
    }
}
