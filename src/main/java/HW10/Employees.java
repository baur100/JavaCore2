package HW10;

public class Employees {
    private String name;
    private String lastName;
    private int salary;


    public Employees(){

    }

    public Employees(String name, String lastName, int salary) {
        this.name = name;
        this.lastName = lastName;
        this.salary = salary;
    }
    public Employees(String name){
        this.name=name;

    }
    public Employees (String lastName,int salary){
        this.lastName=lastName;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setName(String name) {
        this.name = name;

    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

public void printClass(){
    System.out.println("The name of employee is "+name+", last name is "+lastName+" and salary is " +salary);
}

    }


