package models;

public class Interaction {
    public String song_id;
    public boolean liked;
    public int play_count;

    @Override
    public String toString() {
        return "Interaction{" +
                "song_id='" + song_id + '\'' +
                ", liked=" + liked +
                ", play_count=" + play_count +
                '}';
    }
}
