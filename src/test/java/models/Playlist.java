package models;

import java.util.Arrays;

public class Playlist {
    public int id;
    public String name;
    public String[] rules;
    public boolean is_smart;

    @Override
    public String toString() {
        return "Playlist{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", rules=" + Arrays.toString(rules) +
                ", is_smart=" + is_smart +
                '}';
    }
}
