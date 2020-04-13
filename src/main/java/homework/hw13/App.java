package homework.hw13;

public class App {
    public static void main(String[] args) {
        Furniture chair = new Chair(2.5, "NewBrand", "BY756");
        Furniture sofa = new Sofa(3.0, "BrandNew", "A56");

        chair.getInfo();
        sofa.getInfo();

    }
}
