package hw9;

public class Movie {
    public String type;
    public String name;
    public double rating;
    public int runTime;
    public int year;


    public void printInfo(){
        System.out.println("\nMovie name: "+ name+"\nType: "+
                type + "\nRating: "+rating + "\nRunning time: "+ runTime + "\nYear: " + year);
    }
    public void run () {
        System.out.println(name + " is running is theatres");
    }
}