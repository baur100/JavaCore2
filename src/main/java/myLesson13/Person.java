package myLesson13;

public class Person implements Human{
    private int age;

    public Person(int age) {
        this.age = age;
    }

    public void breathe(){
        System.out.println("I can breathe");
    }

    public void think(){
        System.out.println("I can think");
    }

    public int getAge(){
        return age;
    }


}
