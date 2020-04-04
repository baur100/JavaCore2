package hw12;

public class Stuards {
    private String name;
    private String lastName;
    private int expiarence;

    public Stuards(String name, String lastName, int expiarence) {
        this.name = name;
        this.lastName = lastName;
        this.expiarence = expiarence;
    }
    public  void printInfo(){
        System.out.println("Stuart : "+name +" "+lastName +" with "+expiarence+ " years.");
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getExpiarence() {
        return expiarence;
    }
}
