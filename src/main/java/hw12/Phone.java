package hw12;

public class Phone extends Electronics{
    private Logicboard board;

    public Phone(String brand, String model, Logicboard board) {
        super(brand, model, Phone.class.getSimpleName());
        this.board = board;
    }

    public Logicboard getBoard() {
        return board;
    }

    public void setBoard(Logicboard board) {
        this.board = board;
    }
}
