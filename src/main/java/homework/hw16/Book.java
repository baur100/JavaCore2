package homework.hw16;

import java.util.ArrayList;

public class Book {
    private String name;
    private ArrayList authors;
    private int yearPublished;
    private int pages;

    public Book(String name, ArrayList authors, int yearPublished, int pages) {
        this.name = name;
        this.authors = authors;
        this.yearPublished = yearPublished;
        this.pages = pages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList getAuthors() {
        return authors;
    }

    public void setAuthors(ArrayList authors) {
        this.authors = authors;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void printBookInfo(){
        System.out.println(this.name);
        System.out.print("Authors: ");
        this.authors.forEach(x-> System.out.print(x+", "));
        System.out.println("\nYear published: "+ this.yearPublished);
        System.out.println(this.pages+" pages");
        System.out.println();
    }
}
