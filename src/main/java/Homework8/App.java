package Homework8;
public class App {
    public static void main(String[] args) {
        Flower fl1 = new Flower();
        fl1.name = "Rose";
        fl1.color = "pink";
        fl1.smell = "pleasant";
        fl1.availability = "common";

        Flower fl2 = new Flower();
        fl2.name = "Tulip";
        fl2.color = "purple";
        fl2.smell = "pleasant";
        fl2.availability = "common";

        Flower fl3 = new Flower();
        fl3.name = "Daffodil";
        fl3.color = "yellow";
        fl3.smell = "weird";
        fl3.availability = "hard to find";

        Flower fl4 = new Flower();
        fl4.name = "Buttercup";
        fl4.color = "white";
        fl4.smell = "neutral";
        fl4.availability = "hard to find";

        fl1.printFlower();
        fl2.printFlower();
        fl3.printFlower();
        fl4.printFlower();

        if (fl2.availability == "hard to find" && fl2.smell == "weird") {
            System.out.println(fl2.name + " is not good for the bouquet!");
        } else {
            System.out.println(fl2.name + " looks good in all bouquets!");
//        }}
            System.out.println();
            Drink x = new Drink();
            x.name = "Espresso";
            x.price = 3.0;
            x.taste = "bitter";
            x.occasion = "every day";

            Drink y = new Drink();
            y.name = "Lemonade";
            y.price = 2.5;
            y.taste = "fruity";
            y.occasion = "hot day";

            Drink z = new Drink();
            z.name = "Martini";
            z.price = 10.00;
            z.taste = "bitter-sweet";
            z.occasion = "party";

            x.printDrink();
            y.printDrink();
            z.printDrink();

            System.out.println();

            Groceries prod1 = new Groceries();
            prod1.name = "Milk";
            prod1.type = "perishable";
            prod1.price = 4.0;
            prod1.characteristics = "healthy";

            Groceries prod2 = new Groceries();
            prod2.name = "Avocado";
            prod2.type = "perishable";
            prod2.price = 2.0;
            prod2.characteristics = "healthy";

            Groceries prod3 = new Groceries();
            prod3.name = "Barley";
            prod3.type = "non-perishable";
            prod3.price = 5.0;
            prod3.characteristics = "healthy";

            Groceries prod4 = new Groceries();
            prod4.name = "Sugar";
            prod4.type = "non-perishable";
            prod4.price = 4.0;
            prod4.characteristics = "not healthy";

            prod1.printGroc();
            prod2.printGroc();
            prod3.printGroc();
            prod4.printGroc();

            if (prod3.type == "perishable") {
                System.out.println("We can not take " + prod3.name + " for camping.");
            } else {
                System.out.println("Great, let take " + prod3.name + " for camping.");
            }
            System.out.println();

            Shoes s1= new Shoes();
            s1.name = "Sandals";
            s1.material ="straw";
            s1.comfort = "comfortable";
            s1.price = 15.00;

            Shoes s2 = new Shoes();
            s2.name = "Loafers";
            s2.material = "leather";
            s2.comfort = "comfortable";
            s2.price = 100.00;

//            if (x.comfort == "comfortable"&& x.material=="leather" ){
//                System.out.println( x.name + " are great shoes for office!");
//            }else
//                System.out.println(x.name + "are not good choice for office!");

        }
    }
}

