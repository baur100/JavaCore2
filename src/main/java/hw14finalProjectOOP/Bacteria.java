package hw14finalProjectOOP;

public interface Bacteria extends Life {
    @Override
    void eat();

    @Override
    void die();

    @Override
    void breathe();

    @Override
    void reproduce();

    public void pathogen ();
}
