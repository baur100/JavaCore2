package homework.hw16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        var map1 = new HashMap<String, String>();
        Map<Integer, String> map2 = new HashMap<Integer, String>();

        map1.put("Honda","Odessey");
        map1.put("Ford", "F150" );
        map1.put("Honda", "Civic");
        map1.put("Toyota", "Camry");

        map2.put(25, "John");
        map2.put(56,"Maria");
        map2.put(34, "Peter");



        System.out.println(map1);
        System.out.println(map1.containsKey("Honda"));

        for(Map.Entry<String, String> kv:map1.entrySet()){
            System.out.println(kv.getKey() + " : "+ kv.getValue());
        }
        System.out.println();

        System.out.println("---------------Publishing---------------");

        //Authors:
        var authors1 = new ArrayList<String>();
        authors1.add("E.V Jerom");
        authors1.add("Robert Moore");
        var authors2 = new ArrayList<String>();
        authors2.add("J. May");
        var authors3 = new ArrayList<String>();
        authors3.add("J. Clarkson");
        authors3.add("R. Hammond");
        authors3.add("J. May");
        var authors4 = new ArrayList<String>();
        authors4.add("T. Noah");
        var authors5 = new ArrayList<String>();
        authors5.add("F. Maas");
        var authors6 = new ArrayList<String>();
        authors6.add("A. Roberts");

        //Books
        var book1 = new Book("My journey", authors1, 1995,256);
        var book2 = new Book("This is it", authors2, 2002, 567);
        var book3 = new Book("Cars", authors3, 2018, 123);
        var book4 = new Book("Just for now", authors4, 1968, 875);
        var book5 = new Book("Space travel", authors5, 2019, 587);
        var book6 = new Book("Root", authors6, 1989, 390);
        var book7 = new Book("Work on BBC", authors3, 2012, 245);
        var book8 = new Book("Japan", authors2, 2016, 235);

//        book3.printBookInfo();

        //Book sets
        var bookset1 = new ArrayList<Book>();
        bookset1.add(book1);
        bookset1.add(book2);
        bookset1.add(book3);
        var bookset2 = new ArrayList<Book>();
        bookset2.add(book1);
        bookset2.add(book4);
        bookset2.add(book5);
        var bookset3 = new ArrayList<Book>();
        bookset3.add(book6);
        bookset3.add(book7);
        bookset3.add(book8);

//        bookset1.forEach(x->x.printBookInfo());

        //Address
        var address1 = new Address(123, "New st", "Los Angeles", State.CA, 90643);
        var address2 = new Address(45, "Bardstown Rd", "Louisville", State.KY, 40204);
        var address3 = new Address(67, "Old St", "Tampa", State.FL, 54980);

        //Publishings
        var pub1 = new Publishing("Penguin Inc.", 1985, address1);
        var pub2 = new Publishing("NewPrint Inc.", 2002, address2);
        var pub3 = new Publishing("Lee Inc.", 2018, address3);

//        pub1.printPublishingInfo();

        //Publishing-Books
        Map<Publishing, ArrayList<Book>> set = new HashMap<Publishing, ArrayList<Book>>();
        set.put(pub1, bookset1);
        set.put(pub2, bookset2);
        set.put(pub3, bookset3);


        //Printing all books for all publishings
        for(Map.Entry<Publishing, ArrayList<Book>> kv:set.entrySet()){
            kv.getKey().printPublishingInfo();
            System.out.println("Books: ");
            kv.getValue().forEach(x->x.printBookInfo());
            System.out.println("___________________________________________");
        }







    }
}
