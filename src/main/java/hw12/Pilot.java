package hw12;

public class Pilot {
    private String name;
    private  String  lastName;
    private int expiarence;

    public Pilot(String name, String lastName, int expiarence) {
        this.name = name;
        this.lastName = lastName;
        this.expiarence = expiarence;
    }
    public  void printInfo(){
        System.out.println("Pilot : "+name +" "+lastName +" with "+expiarence+ " years.");
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
