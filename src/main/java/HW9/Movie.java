package HW9;

public class Movie {
    public String name;
    public String genre;
    public String director;
    public int year;
    public String country;

    public void show(){
        System.out.println(name+" soon in the theaters");
    }

    public void printInfo(){
        System.out.println("Name: "+name+"\nGenre: "+genre+"\nDirector: "+director+"\nYear: "+year+"\nCountry: "+country);
    }
}
