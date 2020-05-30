package models;

public class Playlist {
    public int id;
    public String name;
    public String[] rules;
    public boolean is_smart;

    public Playlist(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Playlist() {

    }
}
