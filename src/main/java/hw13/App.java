package hw13;

public class App {
    public static void main(String[] args) {
        // Fish Class
        Fish salmon = new Fish("Salmon",15,0.3);
        Fish albacore = new Fish("albacore",14,0.7);

        //Swan class
        Swan swan = new Swan("Swan","white",1);
        Swan drake = new Swan("Drake", "beige",2);

        swan.swim();
        albacore.swim();


    }
}
