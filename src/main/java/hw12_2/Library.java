package hw12_2;

public class Library {
    private String name;
    private Address address;
    private Employee employee;

    public Library() {
    }

    public Library(String name, Address address, Employee employee) {
        this.name = name;
        this.address = address;
        this.employee = employee;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void printInfo() {
        System.out.println("Library{" +
                "name='" + name + '\'' +
                ", address=" + address +
                ", employee=" + employee +
                '}');
    }
}
