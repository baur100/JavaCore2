package hw12_2;

public class App {
    public static void main(String[] args) {
        Address address = new Address("K St", 801, 95814);
        Employee employee = new Employee("Rick", 399654);
        Library library = new Library("Sacramento Library", address, employee);

        String a = library.getEmployee().getName();
        System.out.println(a);
        String b = library.getAddress().getStreetAddress();
        System.out.println(b);

    }
}
