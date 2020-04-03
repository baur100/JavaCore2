package HW11.L11;

public class Menu {
    private Breakfast breakfast;
    private Dinner dinner;

    public Dinner getDinner() {
        return dinner;
    }

    public Breakfast getBreakfast() {
        return breakfast;
    }

    public Menu(Breakfast breakfast, Dinner dinner) {
        this.breakfast = breakfast;
        this.dinner = dinner;
    }

}
