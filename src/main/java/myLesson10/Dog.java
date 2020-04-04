package myLesson10;

public class Dog {
    public String name;
    public int age;
    public String breed;

    public Dog(String n) {
        n = name;
    }


    public Dog(String name1, String breed1, int age1) {
        name = name1;
        breed = breed1;
        age = age1;
    }

    public Dog() {

    }

    public void bark() {
        System.out.println(name + " wow wow");
    }
}
