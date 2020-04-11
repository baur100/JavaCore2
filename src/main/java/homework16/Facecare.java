package homework16;

public class Facecare {
    private String name;
    private String periodity;

    public Facecare(String name, String periodity) {
        this.name = name;
        this.periodity = periodity;

    }
    public void printInfo(){
        System.out.println("You'd better to get "+name + " "+ periodity+"." );
    }
}
