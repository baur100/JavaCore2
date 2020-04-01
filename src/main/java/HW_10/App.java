package HW_10;


public class App {
    public static void main(String[] args) {

        Book book = new Book("Paulo Koelo", 60 );
        Book book1 = new Book("Alchemist");
        book.setAuthor("Paulo");
        book.setNumOfPages(100);


        System.out.println(book.getAuthor());
        System.out.println(book1.getName());
        System.out.println(book.getNumOfPages() + " " + "pages");
        book.printClass();
        System.out.println();


        String [] perf = {"Cats", "Dogs"};
        Theatre theatre = new Theatre("Bolshoi", 300, "12 Main st",perf);

        System.out.println("Name of the Theatre: " + theatre.getName());
        System.out.println("Capacity: " + theatre.getSeats() + " " + "seats");
        System.out.println("Location: " + theatre.getLocation());
        theatre.printClass();
        System.out.println();

        Planet planet = new Planet("Bebe");
        Planet planet1 = new Planet("round", 10000);

        planet.setPopulation(1000);
        planet.setShape("round");
        planet1.setName("New Bebe");

        System.out.println(planet.getName());
        System.out.println(planet1.getShape());
        System.out.println(planet1.getPopulation());
        planet.printClass();




    }
}
