package hw14;

public interface Reptiles extends Vertebrates {
    default void coldBlood() {
        System.out.println(this.getClass().getSimpleName() + " has cold blood");
    }
}
