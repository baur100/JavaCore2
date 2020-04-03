package hw_11_part2;



public class App {
    public static void main(String[] args) {

        Address address = new Address();
        address.Address("Main st", 89011,12);

        Employee employee = new Employee();
        employee.Employee("Mike",123455);

        Casino casino = new Casino();
        casino.Casino("MGM", address, employee);

        String a = casino.getEmployee().getName();
        System.out.println(a);
        String b = casino.getAddress().getStreetName();
        System.out.println(b);
        casino.printInfo();
    }
}
