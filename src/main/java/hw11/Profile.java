package hw11;

import java.text.NumberFormat;

public class Profile {
    private String name;
    private String position;
    private String department;
    private double rate;
    private double overtimeRate;
    private int empId;
    private NumberFormat formatter = NumberFormat.getCurrencyInstance();

    public Profile(String name, String position, String department, double rate, double overtimeRate, int empId) {
        this.name = name;
        this.position = position;
        this.department = department;
        this.rate = rate;
        this.overtimeRate = overtimeRate;
        this.empId = empId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setOvertimeRate(double overtimeRate) {
        this.overtimeRate = overtimeRate;
    }

    public double getOvertimeRate() {
        return overtimeRate;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getRate() {
        return rate;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public int getEmpId() {
        return empId;
    }

    public void displayProfile() {
        System.out.println("Full name: " + name + '\n'
                            + "Position: " + position + '\n'
                            + "Department: " + department + '\n'
                            + "Employee ID: " + empId + '\n'
                            + "Regular Pay Rate: " + formatter.format(rate) + '\n'
                            + "Overtime Pay Rate: " + formatter.format(rate * overtimeRate) + '\n');
        System.out.println(new String(new char[48]).replace('\0', '-'));
    }
}
