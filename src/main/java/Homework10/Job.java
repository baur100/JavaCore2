package Homework10;

public class Job {
    public String name;
    public String department;
    public Double salary;

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
