package HW16P1;

public class Companies {
    private String name;
    private Integer someValue;

    public Companies(String name, Integer someValue) {
        this.name = name;
        this.someValue = someValue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSomeValue() {
        return someValue;
    }

    public void setSomeValue(Integer someValue) {
        this.someValue = someValue;
    }

    @Override
    public String toString() {
        return "Companies{" +
                "name='" + name + '\'' +
                ", population=" + someValue +
                '}';
    }
}
