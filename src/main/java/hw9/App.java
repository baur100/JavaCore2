package hw9;

public class App {
    public static void main(String[] args) {
        Store wholeFoods = new Store();
        Store books = new Store();

        wholeFoods.type = "Grocery";
        wholeFoods.name = "Whole Foods";
        wholeFoods.address = "888 116th Ave NE, Bellevue, WA 98004";
        wholeFoods.openingHour = 8;
        wholeFoods.closingHour = 20;
        wholeFoods.openOnWeekend = true;
        wholeFoods.pricing = "$$";

        books.type = "Book store";
        books.name = "Half priced books";
        books.address = "15600 NE 8th St, Bellevue, WA 98008";
        books.openingHour = 10;
        books.closingHour = 19;
        books.openOnWeekend = false;
        books.pricing = "$";

        System.out.println("Whole Foods store hours: ");
        wholeFoods.hours();

        if (wholeFoods.openOnWeekend) {
            System.out.println("This store is open on weekends");
        }

        wholeFoods.printInfo();

        Table diningTable = new Table();
        diningTable.form = "Round";
        diningTable.material = "Wood";
        diningTable.color ="Walnut";
        diningTable.price = 1000;

        diningTable.printInfo();
        if (diningTable.price > 500) {
            System.out.println("This table is too expensive");
        }

        diningTable.in();

        Milk valley2 = new Milk();
        valley2.brand = "Organic Valley";
        valley2.lactoseFree = false;
        valley2.fatPercent = 2;
        valley2.organic = true;
        valley2.type = "cow";

        System.out.println();
        valley2.popular();
        if (valley2.fatPercent > 0 ) {
            System.out.println("This milk is not fat free");
        }

        Movie toyStory = new Movie();
        toyStory.type = "Animated";
        toyStory.name = "Toy Story";
        toyStory.runTime = 80;
        toyStory.rating = 92;
        toyStory.year = 1995;

        toyStory.printInfo();
        toyStory.run();

    }
}
