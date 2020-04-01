package hw10_z;

public class Work {
    public static void main(String[] args) {
        Cruise cruise = new Cruise();
        cruise.setDestination("Dominican Republic");
        cruise.setDuration(7);
        cruise.setBoatName("Aurora");

        Cruise cruise1 = new Cruise();


//    Movie movie = new Movie("Inception",1,2010,"Christopher Nolan");
//    movie.printMovieInfo();

        Client a = new Client();
        a.setName("Peter");
        a.setLastName("Smith");
        a.getAge();
        a.setCompany("Amazon");

        Client b = new Client("Riley", "Thomas", 55, "Google");
        System.out.println(a.getName());


    }
}
