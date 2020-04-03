package hw11_z;

public class Children {
    private String name1;
    private int age1;
    private String name2;
    private double age2;

    public Children(String name1, int age1, String name2, double age2) {
        this.name1 = name1;
        this.age1 = age1;
        this.name2 = name2;
        this.age2 = age2;
    }

    public double getAge2() {        return age2;
    }

    public int getAge1() { return age1;
    }

    public String getName1() {        return name1;
    }

    public String getName2() {        return name2;
    }

        public void infoChildren() {
            System.out.println("I have two kids: "+ name1+" and "+name2+" who are "+ age1+" and "+ age2+" years old accordingly");
    }

}
