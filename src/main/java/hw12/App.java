package hw12;

public class App {
    public static void main(String[] args) {

        String line = new String(new char[48]).replace('\0', '-');

        /*
            Create instances: Book, Device, Clothing
            They all inherit from Item Class
         */
        Book book = new Book("Elements of Computing Systems", "Build a modern day computer", 79.98, true, 10, "Computer Science", "N/A", 500);
        Device computer = new Device("DELL XPS 275", "32 GB RAM, GeForce 2080 Ti 2 TB SSD", 1799.99, false, 7, "Gaming PC" );
        Clothing jeans = new Clothing("Wrangler", "Slim Jeans", 20.99, true, 8, "XL", "Men's Clothing");

        // Display using superclass method

        System.out.println('\n' + "Exercise 1" + '\n');
        System.out.println(line);
        book.printItem();
        computer.printItem();
        jeans.printItem();

        // Display fields that are specific to these objects

        System.out.println("Display book author: " + book.getAuthor());
        System.out.println("Display book's length: " + book.getLength());
        System.out.println("Display jeans size: " + jeans.getSize());
        System.out.println(line);

        System.out.println('\n' + "Exercise 2" + '\n');
        System.out.println(line);

         /*
            Create instances: Chip, Logic board, Phone
            They all inherit brand and model fields from
            Electronics Class
         */

        Chip chip = new Chip("QUALCOMM", "AX9285", "500 Mbits", "WIFI 6");
        Logicboard board = new Logicboard("SAMSUNG", "GT9002", chip);
        Phone s20 = new Phone("SAMSUNG", "S20", board);

        // Display using superclass method

        s20.printInfo();
        board.printInfo();
        chip.printInfo();

        // Accessing objects fields using GETTERS

        System.out.println(s20.getBoard().getChip().getBrand());
        System.out.println(line);
        System.out.println(s20.getBoard().getChip().getModel());
        System.out.println(line);
        System.out.println(s20.getBoard().getChip().getWifi());
        System.out.println(line);
        System.out.println(s20.getBoard().getChip().getSpeed());
    }
}
