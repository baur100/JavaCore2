package hw12;

public class Logicboard extends Electronics{
    private Chip chip;

    public Logicboard(String brand, String model, Chip chip) {
        super(brand, model, Logicboard.class.getSimpleName());
        this.chip = chip;
    }

    public Chip getChip() {
        return chip;
    }

    public void setChip(Chip chip) {
        this.chip = chip;
    }
}
