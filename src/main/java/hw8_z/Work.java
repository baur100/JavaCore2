package hw8_z;

public class Work {
    public static void main(String[] args){
        Book book = new Book();
        book.name = "Harry Potter";
        book.author = "J.K.Rowling";
        book.genres = "Fantasy Fiction";
        book.numberOfBooks = 7;
        book.publishedYear = 1997;
        book.price = 25;

        System.out.print("The most popular book over the world is: " + "\n" +book.name +
                "\nAuthor - "+ book.author + "\nGenres - "+ book.genres + "\nNumber of books - "+ book.numberOfBooks +
                "\nYear of publish - " + book.publishedYear+ "\nPrice - "+ book.price);

        Furniture table = new Furniture();
        table.type = "table";
        table.material = "plastic";
        table.shape = "round";
        table.color = "clear";

        System.out.println("\nI am looking online to buy a "+ table.shape+ " " + table.material + " " + table.type +
                " and which has a "+ table.color+ " color");

    }

}
