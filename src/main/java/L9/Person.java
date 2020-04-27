package L9;

public class Person {
    public String name;
    public String lastName;
    public int year;
    public int height;
    public String eyeColor;

    public void printInfo() {
        System.out.println("\tName -> " + name + "\n\tLast Name -> " +
                lastName + "\n\tYear -> " + year + "\n\tEye Color -> " + eyeColor + "\n\tHeight -> " + height);
    }
}
