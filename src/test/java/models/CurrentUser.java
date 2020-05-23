package models;

import java.util.Arrays;

public class CurrentUser {
    public int id;
    public String name;
    public String email;
    public boolean is_admin;
    public Preferences[] preferences;

    @Override
    public String toString() {
        return "CurrentUser{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", is_admin=" + is_admin +
                ", preferences=" + Arrays.toString(preferences) +
                '}';
    }
}
