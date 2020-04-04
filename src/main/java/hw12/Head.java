package hw12;

public class Head {
    private String shape;
    private Eye eye;

    public Head(String shape, Eye eye) {
        this.shape = shape;
        this.eye = eye;
    }

    public String getShape() {
        return shape;
    }

    public Eye getEye() {
        return eye;
    }
}
