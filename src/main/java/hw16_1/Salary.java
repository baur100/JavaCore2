package hw16_1;

public class Salary {
    private int amount;
    private String currency;

    public Salary(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public int getAmount() {
        return amount;
    }

    public String getCurrency() {
        return currency;
    }
    public String salary(){
        return(amount+currency);
    }
}

