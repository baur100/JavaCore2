package HW10;

public class Movies {
    private String name;
    private String director;
    private int year;


    public Movies(String name, String director, int year) {
        this.name = name;
        this.director = director;
        this.year = year;
    }

    public Movies(String name, String director) {
        this.name = name;
        this.director = director;
    }

    public Movies(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
    public void printClass(){
        System.out.println("The name of movie is "+name+" the year of release is "+year+" and the director is "+director);

    }
}

