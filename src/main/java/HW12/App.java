package HW12;

public class App {
    public static void main(String[] args) {

        Table table= new Table("Round", "White", 2);
        table.TableprintInfo();

        CoffeeTable coffeeTable = new CoffeeTable ("Oval", "Black", 3, "Black");
        coffeeTable.CoffeeTableprintInfo();

        PatioTable patioTable = new PatioTable ("Oval", "Black", 1, "Black");
        patioTable.PatioTableprintInfo();

        PatioChair patioChair = new PatioChair("Round", "Black", 1, "Black", "New");
        patioChair.PatioChairprintInfo();

        Babychair babychair = new Babychair("Round","Black", 1, "", "New", 1);
        babychair.BabychairprintInfo();


//         table.TableprintInfo();
//
//        coffeeTable.CoffeeTableprintInfo();
//
//        patioTable.PatioTableprintInfo();
//
//        patioChair.PatioChairprintInfo();
//
//        babychair.BabychairprintInfo();


    }
}
