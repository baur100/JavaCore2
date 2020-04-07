package hw15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Work {
    public static void main(String[] args) {
        List<String> pets = new ArrayList<String>();
        pets.add("cat");
        pets.add("dog");
        pets.add("hamster");
        pets.add("parrot");
        System.out.println(pets);
        pets.set(3, "goldfish");
        System.out.println(pets);
        pets.remove("cat");
        System.out.println(pets);
        pets.add(2, "snake");
        System.out.println(pets);
        System.out.println(pets.get(0));
        for (String v: pets) {
            System.out.println(v);
        }
        System.out.println(pets.size());

        List<Integer> dumbbells = new ArrayList<Integer>(Arrays.asList(5, 7, 12,15));
        System.out.println(dumbbells);
        dumbbells.set(2, 8);
        System.out.println(dumbbells);
        dumbbells.add(1,10);
        System.out.println(dumbbells);
        dumbbells.remove(2);
        System.out.println(dumbbells);
        System.out.println(dumbbells.get(3));
        dumbbells.forEach(System.out::println);

        System.out.println();
        Shirt shirt1 = new Shirt("t-shirt", "white");
        Shirt shirt2 = new Shirt("blouse", "black");
        Shirt shirt3 = new Shirt("tank top", "red");
        Shirt shirt4 = new Shirt("tee", "yellow");

        Shoes  shoe1 = new Shoes ("grey", "sneakers");
        Shoes  shoe2 = new Shoes ("red", "heels");
        Shoes  shoe3 = new Shoes ("black", "slip on");
        Shoes  shoe4 = new Shoes ("white", "flats");

        Pants pant1 = new Pants ("black", "jeans");
        Pants pant2 = new Pants ("blue", "pants");
        Pants pant3 = new Pants ("grey", "leggings");
        Pants pant4 = new Pants ("green", "shorts");

        Outfit outfit1 = new Outfit(shirt1, pant1, shoe1);
        Outfit outfit2 = new Outfit(shirt2, pant2, shoe2);
        Outfit outfit3 = new Outfit(shirt3, pant3, shoe3);
        Outfit outfit4 = new Outfit(shirt4, pant4, shoe4);

        List <Outfit> outfits = new ArrayList <Outfit>();
        outfits.add(0, outfit1);
        outfits.add(1, outfit2);
        outfits.add(2, outfit3);
        outfits.set(1, outfit4);
        System.out.println(outfits.size());
        outfits.remove(1);
        System.out.println(outfits.size());
        outfit1.wear();
        System.out.println();
        outfits.get(0).wear();
        outfits.add(0, outfit2);
        System.out.println();
        for (Outfit v:outfits) {
            System.out.println(v.printInfo());
        }
    }
}
