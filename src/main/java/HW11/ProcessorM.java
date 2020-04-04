package HW11;

public class ProcessorM {
    private String number;

    public ProcessorM(String number) {
        this.number = number;
    }
    public void printInfo(){
        System.out.println("Processor => "+number);
    }

    public String getNumber() {
        return number;
    }
}
