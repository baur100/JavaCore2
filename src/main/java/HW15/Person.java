package HW15;

import java.util.List;

public class Person {
    public String names;

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public Person(String names) {
        this.names = names;

    }

    @Override
    public String toString() {
        return "My name is "+names;
    }
}
