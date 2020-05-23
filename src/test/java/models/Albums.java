package models;

public class Albums {
    public int id;
    public int artistId;
    public String name;

    @Override
    public String toString() {
        return "Albums{" +
                "id=" + id +
                ", artistId=" + artistId +
                ", name='" + name + '\'' +
                '}';
    }
}
