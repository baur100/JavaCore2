package HW10;

public class Classmates {
   private String name;
   private String lastname;
   private String id;

    public Classmates(String name, String lastname, String id) {
        this.name = name;
        this.lastname = lastname;
        this.id = id;
    }
    public Classmates() {};

    public void printClassmatesInfo() {
        System.out.println( name+" "+lastname+" "+ id);
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setId(String id) {
        this.id = id;
    }


}
