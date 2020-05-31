package models;

public class SongsOfArtist {
    public int track;
    public String title;
    public String name;
    public String albums_name;
    public double length;

    public SongsOfArtist(int track, String title, String name, String albums_name, double length) {
        this.track = track;
        this.title = title;
        this.name = name;
        this.albums_name = albums_name;
        this.length = length;
    }
    public SongsOfArtist(String name){
        this.name=name;

    }
}
