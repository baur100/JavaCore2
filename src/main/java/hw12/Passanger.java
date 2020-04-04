package hw12;

public class Passanger {
    private int firsClass;
    private int businessClass;

    public Passanger(int firsClass, int businessClass) {
        this.firsClass = firsClass;
        this.businessClass = businessClass;
    }
    public  void printInfo(){
        System.out.println("Total of passanger: "+firsClass +" "+businessClass +" peoples.");
    }

    public int getFirsClass() {
        return firsClass;
    }

    public int getBusinessClass() {
        return businessClass;
    }
}
