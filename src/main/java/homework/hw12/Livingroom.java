package homework.hw12;

public class Livingroom extends Room {
    public Sofa sofa;

    public Livingroom(double square, double cellingHeight, int numberOfwindows, Sofa sofa) {
        super(square, cellingHeight, numberOfwindows);
        this.sofa = sofa;
    }
}
