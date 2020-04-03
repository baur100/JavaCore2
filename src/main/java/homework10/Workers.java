package homework10;

public class Workers {
    private String name;
    private String lastName;
    private int[] birthYear;
    private String service;

//    Constructors



    public Workers(String lastName, int[] birthYear) {
        this.lastName = lastName;
        this.birthYear = birthYear;
    }

    public Workers(String name) {
        this.name = name;
    }

    public Workers(String name, String lastName, int[] birthYear, String service) {
        this.name = name;
        this.lastName = lastName;
        this.birthYear = birthYear;
        this.service = service;
    }

    public Workers(){}

//    Setters

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirthYear(int[] birthYear) {
        this.birthYear = birthYear;
    }

    public void setService(String service) {
        this.service = service;
    }

//    Getters


    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int[] getBirthYear() {
        return birthYear;
    }

    public String getService() {
        return service;
    }

    public void working(){
        System.out.println("Слесарь "+getName()+" "+getLastName()+" делает " +getService());
    }
    public void tuktuk(){
        System.out.println("Слесарь "+getName()+" "+getLastName()+" "+getBirthYear()+ " стучит молотком");
    }

    public void setBirthYear(int i, int i1, int i2) {
    }
}
