package models;

public class GetBookByIdResponse {
    public int bookId;
    public String label;
    public String author;
    public String genre;
    public String condition;

    public GetBookByIdResponse(int bookId, String label, String author, String genre, String condition) {
        this.bookId = bookId;
        this.label = label;
        this.author = author;
        this.genre = genre;
        this.condition = condition;
    }
}
