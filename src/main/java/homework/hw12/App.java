package homework.hw12;

public class App {
    public static void main(String[] args) {

        var chair1 = new Chair(2.0,0.5,0.5,48.99, "Wood", Color.RED);
        var chair2 = new Chair(1.5, 0.5, 0.5, 39.99, "Steel", Color.GREEN);
        var table1 = new Table(2.5,4,5.5,123.45,"Regular wooden", Color.RED, 4);
        var sofa1 = new Sofa(1.5, 2.5, 6, 234.67, "Upholstery", true, 4, Color.GREEN);

        Chair[] kitchenChairs = new Chair[]{chair1, chair2};
        Table[] kitchenTables = new Table[]{table1};

        var kitchen = new Kitchen(14.55, 8.5, 2, kitchenTables, kitchenChairs);
        var livingroom = new Livingroom(20.8, 8.5,4,sofa1);
        var bedroom = new Bedroom(13.5, 8.5, 2);

        var house1 = new House(kitchen, livingroom, bedroom);

        System.out.println("Hight of the sofa in the livingroom of the house1 is "+house1.livingroom.sofa.getHeight());

    }
}
