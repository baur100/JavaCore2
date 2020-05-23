package models;

public class Song {
    public String id;
    public int album_id;
    public int artist_id;
    public String title;
    public String created_at;
    public int disc;
    public int track;
    public double length;

    @Override
    public String toString() {
        return "Song{" +
                "id='" + id + '\'' +
                ", album_id=" + album_id +
                ", artist_id=" + artist_id +
                ", title='" + title + '\'' +
                ", created_at='" + created_at + '\'' +
                ", disc=" + disc +
                ", track=" + track +
                ", length=" + length +
                '}';
    }
}
