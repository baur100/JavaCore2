package myLesson9;

public class Person {
    public String name;
    public String lastName;
    public int year;
    public int heigth;
    public String eyeColor;

    public void printInfo() {
        System.out.println("\tName -> " + name + "\n\tLast Name -> " + lastName + "\n\tYear -> " +
                year + "\n\tHeigth -> " + heigth + "\n\tEye Color -> " + eyeColor);
    }
}
