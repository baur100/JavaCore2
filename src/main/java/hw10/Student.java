package hw10;

public class Student {
    private String name;
    private String lastName;
    private int age;
    private int grade;

    public void printName(String name){
        this.name=name;
    }

    public Student() {
    }

    public Student(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
            }

    public Student(String name, String lastName, int grade, int age) {
        this.name = name;
        this.lastName = lastName;
        this.grade = grade;
        this.age=age;
    }

    public void printInfo() {
        System.out.println("Name - "+name+"\nLast Name - "+lastName+"\nAge - "+age+"\nGrade - "+ grade);
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setLastName(String ln) {
        lastName = ln;
    }
    public String getLastName() {
        return lastName;
    }

    public void setAge(int dob) {
        this.age = dob;
    }
    public int getAge() {
        return age;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
    public int getGrade() {
        return grade;
    }




}
