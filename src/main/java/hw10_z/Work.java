package hw10_z;

public class Work {
    public static void main(String[] args) {
        Cruise cruise = new Cruise();
        cruise.setDestination("Dominican Republic");
        cruise.setDuration(7);
        cruise.setBoatName("Aurora");

        Cruise cruise1 = new Cruise("Italy", 10, "Princess");

        System.out.println(cruise.getBoatName());

        cruise.printClass();
        cruise1.printClass();


//    Movie movie = new Movie("Inception",1,2010,"Christopher Nolan");
//    movie.printMovieInfo();

        Client a = new Client();
        a.setName1("Peter");
        a.setLastName1("Smith");
        a.setAge(25);
        a.setCompany("Amazon");

        Client b = new Client("Riley", "Thomas", 55, "Google");
        System.out.println(a.getName1());
        

        a.printClass();
        b.printClass();
    }

}
