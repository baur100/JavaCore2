package L10;

public class Dog {
    public String name;
    public String breed;
    public int age;

    public Dog(String name1, String breed1, int age1){
        name = name1;
        breed = breed1;
        age=age1;
    }

    public Dog(){}

    public Dog(String n){
        name=n;
    }

    public void bark(){
        System.out.println(name+" Wow-wow");
    }
}
