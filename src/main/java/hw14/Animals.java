package hw14;

public interface Animals extends Life {
    void runSwim();
    default void digestInternally() {
        System.out.println(this.getClass().getSimpleName() + " digests food internally");
    }
}
