package hW_10;

public class Book {

    private String name;
    private String author;
    private int numOfPages;

    public Book(String name) {
        this.name = name;
    }
    public Book(String author, int numOfPages) {
        this.author = author;
        this.numOfPages = numOfPages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public int getNumOfPages() {
        return numOfPages;
    }

    public void setNumOfPages(int numOfPages) {
        if (numOfPages < 60)
            System.out.println("Number of pages is 60");
        this.numOfPages = numOfPages;
    }

    public Book(){

    }

    public void printClass(){

    }


}

