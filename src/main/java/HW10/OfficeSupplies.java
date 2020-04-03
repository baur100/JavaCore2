package HW10;



public class OfficeSupplies {
    private String name;
    private int grade;
    private String subject;
    private int amount;


    public OfficeSupplies(String name, int grade, String subject, int amount) {
        this.name = name;
        this.grade = grade;
        this.subject = subject;
        this.amount = amount;
    }


    public OfficeSupplies () {};



    public void printInfoOfficeSupplies () {
        System.out.println( name+" "+grade+" "+subject+" "+ amount);
     }



    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public String getSubject() {
        return subject;
    }

    public int getAmount() {
        return  amount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
