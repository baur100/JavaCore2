package HW9;

public class app {
    public static void main(String[] args) {

        Cat mycat = new Cat();
        mycat.hairiness = "smooth coat,";
        mycat.breed = "siamese";
        mycat.age = 5;
        System.out.println("My cat is " + mycat.hairiness + " breed " + mycat.breed + " and age is " + mycat.age + ".");

        Cock cock = new Cock();
        cock.color = "rainbow color,";
        cock.speed = "very speedly";
        cock.size = "big size";
        System.out.println("My cock is " + cock.color + " " + cock.speed + " and " + cock.size + ".");

        Dog dog = new Dog();
        dog.name = "Baron,";
        dog.breed = "Rotweiler,";
        dog.color = "black";
        dog.age = 6;
        System.out.println("My dog name is " + dog.name + " breed " + dog.breed + " color " + dog.color + " and age is " + dog.age + ".");

        Shark shark = new Shark();
        shark.breed = "ocean";
        shark.speed = "fast";
        System.out.println("I see shark, her speed is very " + shark.speed + " and breed is " + shark.breed + " type.");

        dog.lovely();
        mycat.certainty();
        cock.beauty();
        shark.swim();

    }
}
