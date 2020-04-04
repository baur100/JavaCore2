package hw12;

public class TV {
    private String name;
    private String model;
    private int size;

    public TV(String name, String model, int size) {
        this.name = name;
        this.model = model;
        this.size = size;
    }

    public TV() {
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public int getSize() {
        return size;
    }
}
