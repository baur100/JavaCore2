package hw_11_part2;

public class Employee {
    private String workAddress;
    private String workHours;
    private double salary;

    public Employee(){}

    public Employee(String workAddress, String workHours, double salary) {
        this.workAddress = workAddress;
        this.workHours = workHours;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getWorkAddress() {
        return workAddress;
    }

    public void setWorkAddress(String workAddress) {
        this.workAddress = workAddress;
    }

    public String getWorkHours() {
        return workHours;
    }

    public void setWorkHours(String workHours) {
        this.workHours = workHours;
    }

    public void printInfo(){
        System.out.println();
    }
}
