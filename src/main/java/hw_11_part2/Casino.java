package hw_11_part2;

public class Casino {

    private String name;
    private Address address;
    private Employee employee;

    public Casino (){}

    public Casino ( String name, Address address, Employee employee){
        this.name=name;
        this.address =address;
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
        System.out.println();

    }
}
