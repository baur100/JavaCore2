package HW10;

public class Work {
    public static void main(String[] args) {
        Countries country = new Countries("France", "Europe", 70);
        Countries country1= new Countries("UK",66);
        System.out.println(country.getName());
        System.out.println(country1.getPopulation());
        country.printClass();

        Employees employee =new Employees("John","Dow",75000);
        Employees employee1 = new Employees("Victoria","Smith",90000);

        System.out.println("Employee name is "+employee.getLastName());
        employee.printClass();


        Movies movie = new Movies ("Avatar","James Cameron",2010);
        Movies movie1 = new Movies ("Interstellar","Christopher Nolan");
        System.out.println(movie.getDirector());
        System.out.println(movie1.getName());
        movie.printClass();


    }
}
