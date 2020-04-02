package hw10;

public class Doctor {
    private String name;
   private String type;
    private int age;

    public Doctor(String n, String t, int a) {
        name = n;
        type = t;
        age = a;
    }

    public Doctor() {
    }

    public void printDoctorInfo() {
        System.out.println(name+" "+" " +" is " +type+" "+" and " +age+"  years old");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
            }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
            }

    public String getType() {
        return type;
    }

    public int getAge() {
        return age;
    }
}
