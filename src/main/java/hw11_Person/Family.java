package hw11_Person;

public class Family {
    private Spouse spouse;
    private String []kids;

    public Family(Spouse spouse, String[] kids) {
        this.spouse = spouse;
        this.kids = kids;
    }



    public void printFamily(){
        spouse.printSpouseName();
        System.out.print("Kids: ");
        for (String kid:kids){
            System.out.print(kid+", ");
        }
    }
}
