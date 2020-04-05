package HW13;

//implements, abstract method - this body
public class Tesla implements Car {
    private int year;

    public Tesla(int year) {
        this.year = year;
    }

    public void speed() {
        System.out.println("Tesla has more speed!");
    }

    public void color() {
        System.out.println("Tesla has best color!");
    }

    public int getYear() {
        return 0;
    }
    // different function
    public void setYear(int year) {
        this.year = year;
    }
}
