package homework.hw12;

public class Kitchen extends Room {
    protected Table[] tables;
    protected Chair[] chairs;
    protected Microwave microwave;

    public Kitchen(double square, double cellingHeight, int numberOfwindows, Table[] tables, Chair[] chairs) {
        super(square, cellingHeight, numberOfwindows);
        this.tables = tables;
        this.chairs = chairs;
    }

    public Kitchen(double square, double cellingHeight, int numberOfwindows, Table[] tables, Chair[] chairs, Microwave microwave) {
        super(square, cellingHeight, numberOfwindows);
        this.tables = tables;
        this.chairs = chairs;
        this.microwave = microwave;
    }
}
