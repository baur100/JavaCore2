package helpers;

import models.Playlist;
import models.Song;
import models.SongsOfArtist;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class HwDbAdapter {
    static final String JDBC_DRIVER = "org.mariadb.jdbc.Driver";
    static final String DB_URL = "jdbc:mariadb://koelapp.testpro.io/dbkoel";
    static final String USER = "dbuser02";
    static final String PASS = "pa$$02";

    static Connection conn = null;
    static Statement stmt = null;
    public static List<Song> getAllSongs() throws SQLException {
        List<Song> songs = new ArrayList<Song>();
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();

            String sqlQuery = "SELECT * FROM songs";
            ResultSet rs = stmt.executeQuery(sqlQuery);
            while (rs.next()) {
                String id = rs.getString("id");
                int album_id=rs.getInt("album_id");
                int artist_id=rs.getInt("artist_id");
                String title = rs.getString("title");
                int track = rs.getInt("track");
                double length = rs.getDouble("length");

                Song song = new Song(id,album_id,artist_id,title,track,length);
                songs.add(song);
            }
        } catch (SQLException | ClassNotFoundException err) {
            err.printStackTrace();
        } finally {
            if (conn != null) {
                conn.close();
            }
        }
        return songs;
    }

    public static SongsOfArtist getListOfSongsByNameOfArtist(String name) throws SQLException {
        SongsOfArtist returnedListOfSongs = new SongsOfArtist(name);
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();

            String sqlQuery = "select s.track, s.title,a.name, al.name albums_name,s.length/60 AS length from albums al join artists a on al.artist_id=a.id join songs s on al.artist_id =s.artist_id where a.id = "+name+" group by s.title";
            List<SongsOfArtist> sngs = new ArrayList<>();
            ResultSet s = stmt.executeQuery(sqlQuery);
            while (s.next()) {
                int track = s.getInt("track");
                String title = s.getString("title");
                String artist_name = s.getString("name");
                String albums_name = s.getString("albums_name");
                double length = s.getDouble("length");



                SongsOfArtist song = new SongsOfArtist(track,title,name,albums_name,length);
                sngs.add(song);
            }

        } catch (SQLException | ClassNotFoundException err) {
            err.printStackTrace();
        } finally {
            if (conn != null) {
                conn.close();
            }
        }
        return returnedListOfSongs;
    }
}
