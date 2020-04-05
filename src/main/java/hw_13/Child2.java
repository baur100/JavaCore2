package hw_13;

public final class Child2 extends Child1  implements Activity {

    private String hairLength;

    public Child2(String name, Address address, int age, int grade) {
        super(name, address, age, grade);
        this.hairLength = hairLength;
    }

    public String getHairLength() {
        return hairLength;
    }

    }


