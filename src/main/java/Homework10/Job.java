package Homework10;

public class Job {
    private String name;
    private String department;
    private Double salary;

    public String getName(){
        return name;
    }
    public String getDepartment(){
        return department;
    }
    public Double getSalary(){
        return salary;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setDepartment(String department){
        this.department=department;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Job(String n, String d, Double s) {
        n = name;
        d = department;
        s = salary;
    }
    public Job(String T, String D){
        name = T;
        department=D;
    }

    public void printJob(){
        System.out.println(name + " works in "+ department + " for " + salary + " per hour.");
    }
}
