package hw14finalProjectOOP;

public interface Birds extends Vertebrates {
    @Override
    void eat();

    @Override
    void die();

    @Override
    void breathe();

    @Override
    void reproduce();

    @Override
    void legs();

    @Override
    void chorda();

    public void fly();
}
