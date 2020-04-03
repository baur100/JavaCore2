package hw11_z;

public class Realtor {
    private String name;
    private String lastName;
    private long cellNumber;
    private String license;
    private String area;
    private Listening listening;


    public Realtor(String name, String lastName, long cellNumber, String license, String area, Listening listening) {
        this.name = name;
        this.lastName = lastName;
        this.cellNumber = cellNumber;
        this.license = license;
        this.area = area;
        this.listening = listening;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public Listening getListening() {
        return listening;
    }

    public void printRealtor() {
        String realtor = "Realtor{" + name+
                " Last Name='" + lastName + '\'' +
                ", cell='" + cellNumber + '\'' +" Area ="+area+
                '}';
        System.out.println(realtor);
    }
}


