package homework13;

public class Actor implements Artist{
    private int pay;
    private String genre;
    private String type;

    public Actor(int pay, String genre, String type) {
        this.pay = pay;
        this.genre = genre;
        this.type = type;
    }
    public void create() {
        System.out.println("I create.");
    }
    public void perform() {
        System.out.println("I perform.");
    }
    public int getPaid(){
        return pay;
    }
    public String getGenre() {
        return genre;
    }
    public String getType() {
        return type;
    }
    public String toString() {
        return "Actor{" +
                "pay=" + pay +
                ", genre='" + genre + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
