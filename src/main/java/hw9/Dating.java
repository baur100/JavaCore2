package hw9;

public class Dating {
    public static String name;
    public static int age;
    public static int height;
    public boolean gender; // false = man, true = woman

    public void printInfo(String gender) {
        System.out.println("\tName - " + name +
                "\n\tAge - " + age +
                "\n\tHeight - " + height +
                "\n\tGender - " + gender);
    }

    public static String genderVar(boolean gender) {
        String x;
        if (gender == false) {
            x = "Man";
        } else {
            x = "Woman";
        }
        return x;
    }
}
