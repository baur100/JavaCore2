package hw_11_part1;

public class SysBlock {

    private Motherboard motherboard;
    private Processor processor;


    public SysBlock() {

    }

    public SysBlock(String htp, String gg) {
    }

    public void printInfo(){
        System.out.println("SysBlock details: " + motherboard + " " + processor);
    }
}
