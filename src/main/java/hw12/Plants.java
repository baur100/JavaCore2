package hw12;

public class Plants {
    private String name;
    private String type;

    public Plants(String name, String type) {
        this.name = name;
        this.type = type;
    }
    public void like(){
        System.out.println("I like "+ name);
    }
}
