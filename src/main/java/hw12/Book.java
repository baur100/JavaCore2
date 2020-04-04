package hw12;

public class Book extends Item{
    private String author;
    private int length;

    public Book(String title, String description, double price, boolean available, int rating, String category, String author, int length) {
        super(title, description, price, available, rating, category, Book.class.getSimpleName());
        this.author = author;
        this.length = length;
    }

    public String getAuthor() {
        return author;
    }

    public int getLength() {
        return length;
    }
}
