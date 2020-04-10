package hWA10;

public class Book {
    private String name;
    private int[] numberOfPages;
    private String digital;
    private String author;
    private int year;
    private String hardEdition;
    private String condition;

    public Book(String name, int[] numberOfPages, String digital, String author, int year, String hardEdition, String condition) {
        this.name = name;
        this.numberOfPages = numberOfPages;
        this.digital = digital;
        this.author = author;
        this.year = year;
        this.hardEdition = hardEdition;
        this.condition = condition;
    }


    public Book() {
    }

    public String getCondition() {
        return condition;
    }

    public int getYear() {
        return year;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int[] getNumberOfPages() {
        return numberOfPages;
    }

    public String getDigital() {
        return digital;
    }

    public String getHardEdition() {
        return hardEdition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public void setYear(int year) {
        if (year > 1850 && year < 2020) {
            this.year = year;
            return;
        }
        System.out.println("wrong year");
        this.year = 2020;
    }


    public void setName(String name) {
        if (name.length() < 2) {
            System.out.println("wrong name of Book");
            this.name = "00";
            return;
        }
        this.name = name;
    }

    public void setAuthor(String author) {
        if (author.length() < 2) {
            System.out.println("wrong name of author");
            this.author = "00";
            return;
        }
        this.author = author;
    }

    public void setDigital(String digital) {
        this.digital = digital;
    }

    public void setHardEdition(String hardEdition) {
        this.hardEdition = hardEdition;
    }

    public void setNumberOfPages(int[] numberOfPages) {
        this.numberOfPages = numberOfPages;
    }





        public void printInfo (){
            for(int x: numberOfPages)

            {

        System.out.println("Book " + name + ", Author: " + author + ", was edited in " + year + "\nNumber of pages: " + x);
    }
    }
}

