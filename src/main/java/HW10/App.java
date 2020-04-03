package HW10;

public class App {
    public static void main(String[] args) {


        var medovik = new Cake();
        medovik.setCream("Butter cream");
        medovik.setDough("Honey dough");
        medovik.setName("Medovik");
        medovik.setWeight(1.5);
        medovik.setIngredients(new String[]{"eggs, wheat flour, honey, butter"});

        medovik.printClass();


        String[] ingredients = new String[]{"eggs, milk, baking powder, flour, butter"};
        var skazka = new Cake("Skazka", "Bisquit","Charlotte",1.2, ingredients);

        System.out.println("**********************");
        skazka.printClass();

        var cropFarm = new Farm();
        cropFarm.setName("Underwood Farms");
        cropFarm.setOwner("Jake Underwood");
        cropFarm.setType("crop farm");
        cropFarm.setProduce(new String[]{"Strawberry, blueberry, spinach, onion"});

        System.out.println("**********************");
        cropFarm.printInfo();

        String[]products = new String[]{"Chickens, ducks, turkyes, geese"};
        var poultryFarm = new Farm("Tyson poultry", "Jacque Tyson", "poultry farm", products);

        System.out.println("**********************");
        poultryFarm.printInfo();

        var walmart = new Store();
        walmart.setName("Walmart");
        walmart.setChain(true);
        walmart.setEstablished(1950);
        walmart.setDepartments(new String[]{"Dairy, Meat, Poultry, Frozen, Fruits/Vegetables"});

        System.out.println("**********************");
        walmart.printInfo();

        String[] departments = new String[]{"Hands, Face, Body, Perfume"};
        var ritasCosmetics = new Store("Rita`s cosmetic", "Rita Johnson", 2017, false, departments);

        System.out.println("**********************");
        ritasCosmetics.printInfo();

    }

}
