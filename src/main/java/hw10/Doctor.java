package hw10;

public class Doctor {
    private String name;
   private String type;
    private int age;
    private int[] floor;

    public Doctor(String n, String t, int a,int[]f) {
        name = n;
        type = t;
        age = a;
        floor=f;

    }

    public Doctor() {
    }

    public Doctor(String alex, String cardiolog, int a, int i) {
    }

    public void printDoctorInfo() {
        System.out.println(name+" "+" " +" is " +type+" "+" and " +age+"  years old" + " He is on the "+ floor.length);
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

    public void setFloor(int[] floor) {
        this.floor = floor;
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

    public int[] getFloor() {
        return floor;
    }
}
