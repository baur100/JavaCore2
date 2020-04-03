package hw_11_part2;



public class App {
    public static void main(String[] args) {

        Address address = new Address("Main st", 12, 89012);
        Employee employee = new Employee("Mike",12345);
        Casino casino = new Casino("MGM",address,employee);

        String a = casino.getEmployee().getName();
        System.out.println(a);
        String b = casino.getAddress().getStreetName();
        System.out.println(b);
        casino.printInfo();
    }
}
