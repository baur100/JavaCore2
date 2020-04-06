package hw13;

public class School implements Education {
           private int age;

    public School(int age) {
        this.age = age;
    }
    public void study() {
        System.out.println("Her children study in elementary school. ");
    }
    public void teach() {
        System.out.println("She is teaching in this school.");
    }
      public int getAge() {
        return age;
    }

}