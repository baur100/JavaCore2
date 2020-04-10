package hWA8;

public class Book {
    public String name;
    public int numberOfPages;
    public String digital;
    public String author;
    public int year;
    public String hardEdition;
    public String condition;

    public void printInfo(){System.out.println("Book "+name+", Author: "+author+", was edited in "+year
    );}
    public void conditionBook(){System.out.println("Book: "+name+"\nCondition: "+condition);}
    public void bookEdition(){System.out.println("Book: "+name+", Author "+author+", Digital Edition: "+digital+", Paper Edition: "+hardEdition);}
    public void bookSize(){System.out.println("Book: "+name+", Author: "+author+", number of pages: "+numberOfPages);}
}
