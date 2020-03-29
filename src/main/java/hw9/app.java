package hw9;

public class app {
    public static void main(String[] args) {
        Resume myself = new Resume();
        myself.name = " Nasyikat";
        myself.age = 41;
        myself.residence = "Texas";
        myself.job = "accountant";
        myself.hobby = "cooking ";

        var friend = new Resume();
        friend.name = "Aika";
        friend.age = 43;
        friend.residence = "Kyrgyzstan";
        friend.job = "lawyer";
        friend.hobby = "yoga";

        System.out.println("My name is " + myself.name + "." + " I am " + myself.age + "." + " I live in " +
                myself.residence + "." + " My job was an " + myself.job + "." + " I am " + myself.hobby + "every day" + " .");

        myself.learn();

        System.out.println(" My friend is " + friend.name + "." + " She is from " + friend.residence + "."
                + friend.name + " works like as a" + friend.job + " and to do " + friend.hobby + ".");

        Place kyrgyz = new Place();
        kyrgyz.country = " Kyrgyzstan";
        kyrgyz.capital = "Bishkek";
        kyrgyz.population = 6.389500;
        kyrgyz.nationality = " kyrgyz";
        kyrgyz.language = "kyrgyz & russian";

        var america = new Place();
        america.country = " USA ";
        america.capital = "Washington";
        america.population = 329.000045;
        america.nationality = "american";
        america.language = "english & spanish";

        if (kyrgyz.population < america.population) {
            System.out.println("Kyrgyzstan is small");
        } else {
            System.out.println("America is small");
        }
        america.printinfo();

        kyrgyz.printinfo();

        Clothing some = new Clothing();
        some.brand = " GICCI";
        some.type = " coat";
        some.color = " multi";
        some.size = 16;
        some.price = 2999.99;

        var other = new Clothing();
        other.brand = "NIKE";
        other.type = "sport";
        other.color = "white";
        other.size = 8;
        other.price = 299.99;

        if (some.price > other.price) {
            System.out.println("It is too expensive!");
        } else {
            System.out.println("I will buy this!");
        }
        some.printinfo();

        Dish meal = new Dish();
        meal.mean = " This food was a ";
        meal.main = "Steak";
        meal.recipe = 1.7;
        meal.taste = "grilled";

        var drink = new Dish();
        drink.mean = "Juice";
        drink.main = "apple";
        drink.recipe = 2.5;
        drink.taste = "Sweet";

        System.out.println(meal.mean + " " + meal.main + "." + "I ordered " + meal.recipe + " pound" + "."
                + "It tasted " + meal.taste + " .");

        meal.like();
    }
}


