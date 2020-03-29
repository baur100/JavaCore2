package hw8_z;

public class Book {
    public String name;
    public String author;
    public String genres;
    public int numberOfBooks;
    public double price;
    public int publishedYear;

    public void bookInfo(){
        System.out.println("The most popular book over the world is: " + "\n" +name +
                "\nAuthor - "+ author + "\nGenres - "+ genres + "\nNumber of books - "+ numberOfBooks +
                "\nYear of publish - " + publishedYear+ "\nPrice - "+ price);
    }

}
