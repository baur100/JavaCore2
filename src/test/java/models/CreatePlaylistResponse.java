package models;

public class CreatePlaylistResponse {
    public String name;
    public int id;
    public String[] songs;

    public CreatePlaylistResponse(String name, int id, String[] songs) {
        this.name = name;
        this.id = id;
        this.songs = songs;
    }
}
