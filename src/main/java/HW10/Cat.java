package HW10;

public class Cat {

    private String name;
    private String breed;
    private int size;
    private int age;

    public Cat(String name, String breed, int size, int age) {
        this.name = name;
        this.breed = breed;
        this.size = size;
        this.age = age;
    }

    public Cat() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

