package HW11_Person;

public class Birthday {
    private String month;
    private int day;
    private int year;

    public Birthday(String month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public void printBirthday(){
        System.out.println("Date of Birth: "+day+" "+month+" "+year);
    }
}
