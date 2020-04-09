package HW11;

public class Processor {
    private String name;
    private int number;

    public Processor(String name, int number) {
        this.name = name;
        this.number = number;
    }
    public Processor (){};

    public void printInfo(){String yy =("SysBlock includes: processor, mother block, RAM.\nProcessor name: " + name + "\nProcessor number: " + number);
        System.out.println(yy);
    }


    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

}
