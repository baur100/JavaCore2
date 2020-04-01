package hw10_z;

public class Movie {
    private String name;
    private int parts;
    private int year;
    private String filmmaker;

    public String getName(){
        return name;
    }

    public void setName() {
        this.name = name;
    }
    public int getParts() {
        return parts;
    }

    public void setParts(int parts) {
        this.parts = parts;
    }

    public Movie(String n, int p, int y, String fm){
        name = n;
        parts = p;
        year = y;
        filmmaker = fm;
    }

    public Movie(){}

    public void printMovieInfo() {
    System.out.println(name+" "+parts+"st part was released in "+ year+ " by "+filmmaker);
    }


}
