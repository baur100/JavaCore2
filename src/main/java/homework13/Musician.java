package homework13;

public class Musician extends Singer {
    private String instrument;

    public Musician(String instrument) {
        super();
        this.instrument = instrument;
    }

    public String getInstrument() {
        return instrument;
    }

    public void printInfo(){
        System.out.println("I make music and play "+instrument+".");
    }
}
