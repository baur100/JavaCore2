package hw14;

public abstract class Carnivores implements Mammals {
    protected String name;
    protected String[] preyType;
    private int age;

    public Carnivores(String name, String[] preyType, int age) {
        this.name = name;
        this.preyType = preyType;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPreyType(String[] preyType) {
        this.preyType = preyType;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String[] getPreyType() {
        return preyType;
    }

    public int getAge() {
        return age;
    }

    public abstract void printInfo();

}
