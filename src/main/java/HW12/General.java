package HW12;

public class General {
    protected String firstname;
    protected String lastname;
    protected String rank;
    protected String gender;
    protected String city;

    public General(String firstname, String lastname, String rank, String gender, String city) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.rank = rank;
        this.gender = gender;
        this.city = city;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getRank() {
        return rank;
    }

    public String getGender() {
        return gender;
    }

    public String getCity() {
        return city;
    }
}
