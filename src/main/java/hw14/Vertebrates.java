package hw14;

public interface Vertebrates extends Animals {
    default void haveSpinalCord() {
        System.out.println(this.getClass().getSimpleName() + " has a spinal cord");
    }
}
