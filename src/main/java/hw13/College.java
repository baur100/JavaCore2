package hw13;

public class College implements Education {
    private int age;

    public College(int age) {
        this.age = age;
    }
    public void study() {
        System.out.println("My son is studying in Houston College");
    }
    public void teach() {
        System.out.println("In Houston College there are great professors teach ");
    }
       public int getAge() {
        return age;
    }
}
