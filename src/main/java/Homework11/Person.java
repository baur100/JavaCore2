package Homework11;

public class Person {
    private String name;
    private int age;
    private Occupation occupation;
    private Pet pet;

    public Person(String name, int age, Occupation occupation, Pet pet) {
        this.name = name;
        this.age = age;
        this.occupation = occupation;
        this.pet = pet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Occupation getOccupation() {
        return occupation;
    }

    public void setOccupation(Occupation occupation) {
        this.occupation = occupation;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
    public void printPerson(){
       String person = "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", occupation=" + occupation +
                ", pet=" + pet +
                '}';
        System.out.println(" This is " + name + ". "+ name + " is "+ age+ " years old, works as "+ occupation + " and has a "+ pet +"." );
    }
}


