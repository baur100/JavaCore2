package models;

public class User {
    public int id;
    public String name;
    public String email;
    public boolean is_admin;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", is_admin=" + is_admin +
                '}';
    }
}
