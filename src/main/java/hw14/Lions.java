package hw14;

public class Lions extends Carnivores {
    private int age;
    private String name;

    public Lions(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void hasHair() {
        System.out.println(name+" has hair");

    }

    @Override
    public void hasSkull() {
        System.out.println(name+ " has a skull");

    }

    @Override
    public void canBreathe() {
        System.out.println(name+ "can breathe");

    }

    @Override
    public void canDie() {
        System.out.println(name+" can die");

    }

    @Override
    public void canBreed() {
        System.out.println(name+ "can breed");

    }

    @Override
    public void canEat() {
        System.out.println(name+" can eat");

    }

    public void canJump(){
        System.out.println(name+" can jump high");
    }
}



