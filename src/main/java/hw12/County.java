package hw12;

public class County extends City {
    public String nameCounty;
    public String zipCode;

    public County(String country, String state, int population, String capitol, String time, String metropolia, String mayor) {
        super(country, state, population, capitol, time, metropolia, mayor);
    }

    public void setNameCounty(String nameCounty) {
        this.nameCounty = nameCounty;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public County(String country, String state, int population, String capitol,
                  String time, String metropolia, String mayor, String nameCounty, String zipCode) {
        super(country, state, population, capitol, time, metropolia, mayor);
        this.nameCounty = nameCounty;
        this.zipCode = zipCode;
    }

    public String getNameCounty() {
        return nameCounty;
    }

    public String getZipCode() {
        return zipCode;
    }
}
