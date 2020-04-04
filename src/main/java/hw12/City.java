package hw12;

public class City extends State {
    protected String metropolia;
    protected String mayor;

    public City(String country, String state, int population, String capitol, String time,
                String metropolia, String mayor) {
        super(country, state, population, capitol, time);
        this.metropolia = metropolia;
        this.mayor = mayor;
    }

    public String getMetropolia() {
        return metropolia;
    }

    public String getMayor() {
        return mayor;
    }
}
