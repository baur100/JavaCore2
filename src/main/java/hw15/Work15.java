package hw15;

import java.util.ArrayList;
import java.util.List;

public class Work15<levelESL> {
    public static void main(String[] args) {

        List<Book> book = new ArrayList<>();

        Book b1 = new Book(201, "Kolobok", "Ushinsky", "Russia", 8);
        Book b2 = new Book(202, "Repka", "Tolstoy", "Russia", 4);
        Book b3 = new Book(203, "Masha & the Bear", "Kuzovkov", "Russia", 6);
        Book b4 = new Book(204, "The Tale of Tsar Saltan", "Pushkin", "Russia", 10);

        book.add(b1);
        book.add(b2);
        book.add(b3);
        book.add(b4);
        System.out.println(" I have 4 books: ");
        for (Book b : book) {
            System.out.println("\n ID -> " + b.id + "\n\t Name-> " + b.name + "\n\tAuhor -> " + b.author + "\n\tPublisher -> " + b.publisher + "\n\tQuantity -> " + b.quantity);
        }
            System.out.println("I read this book:");
            book.remove(b1);
            System.out.println(book.remove(1));


        List<Integer> levelEsl = new ArrayList<>();
        levelEsl.add(1);
        levelEsl.add(2);
        levelEsl.add(3);
        levelEsl.add(4);
        levelEsl.add(5);

        System.out.println("We have 5 Level ESL Classes:");
        levelEsl.forEach(x -> System.out.println(x));
        System.out.println("My level is ");
        levelEsl.set(0, 6);
        System.out.println(levelEsl.set(0, 6));
        System.out.println(" I started from : ");
        levelEsl.get(3);
        System.out.println(levelEsl.get(3));
        levelEsl.remove(0);
        System.out.println(levelEsl.remove(0));

        Food dood =new Food("Plov",2);
        System.out.println("I am going to cook "+new Food("Plov",2));
        Produce p1 = new Produce("Meat",1,"Walmart");
        var p2=new Produce("Carrots",1,"Walmart");
        var p3=new Produce("Oil",1,"Walmart");

        List<Produce> produce= new ArrayList<>();
        produce.add(p1);
        produce.add(p2);
        produce.add(p3);
        for (Produce p:produce) {
            System.out.println(" Plov included : "+p.getName());
            produce.set(0,p2);
            System.out.println(produce);


        }
    }

}
//Создайте 3 ArrayList - String, Integer и произвольного класса (придумайте сами)
//        добавьте в каждый ArrayList по 4 элемента
//        попробуйте методы add/set/remove/get/foreach
