package Less11;

import javax.swing.plaf.SplitPaneUI;

public class Person {
    private String name;
    private String lastName;
    private  Adress address;

    public Person(String name, String lastName, Adress address) {
        this.name = name;
        this.lastName = lastName;
        this.address = address;
    }

    public String getLastName() {
        return lastName;
    }

    public Adress getAddress() {
        return address;
    }
}
