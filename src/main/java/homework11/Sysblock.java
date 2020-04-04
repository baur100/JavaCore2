package homework11;

public class Sysblock {
    private Processor processor;
    private Motherboard mothboard;

//    Constructors

    public Sysblock(Processor processor, Motherboard mothboard) {
        this.mothboard=mothboard;
        this.processor=processor;
    }





    public void printInfo(){
        System.out.println("Sysblock with "+processor+" processor and "+mothboard+" motherboard");
    }
}
