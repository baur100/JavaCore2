package helpers;

import models.Artist;
import models.Playlist;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DbAdapter {
    static final String JDBC_DRIVER = "org.mariadb.jdbc.Driver";
    static final String USER = "dbuser02";
    static final String PASS = "pa$$02";
    static final String DB_URL = "jdbc:mariadb://koelapp.testpro.io/dbkoel";

    static Connection conn = null;
    static Statement stmt = null;


    public static List<Artist> getArtists() throws SQLException {
        List<Artist> artists =new ArrayList<Artist>();
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            //STEP 4: Execute a query
            stmt = conn.createStatement();

            String sqlQuery = "SELECT*FROM artists a ";

            ResultSet rs = stmt.executeQuery(sqlQuery);
            while (rs.next()) {
                String name = rs.getString("name");
                int id=rs.getInt("id");

                Artist artist =new Artist(id,name);
                artists.add(artist);
            }
        } catch (SQLException | ClassNotFoundException err) {
            //Handle errors for JDBC
            err.printStackTrace();

        } finally {
            //finally block used to close resources

            if (conn != null) {
                conn.close();
            }
        }
        return artists;
    }
    public static List<Playlist> getAllPlaylist() throws SQLException {
        List<Playlist> playlists =new ArrayList<Playlist>();
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            //STEP 4: Execute a query
            stmt = conn.createStatement();

            String sqlQuery = "SELECT*FROM playlist ";

            ResultSet rs = stmt.executeQuery(sqlQuery);
            while (rs.next()) {
                String name = rs.getString("name");
                int id=rs.getInt("id");

                Playlist playlist =new Playlist(id,name);
                playlists.add(playlist);
            }
        } catch (SQLException | ClassNotFoundException err) {
            //Handle errors for JDBC
            err.printStackTrace();

        } finally {
            //finally block used to close resources

            if (conn != null) {
                conn.close();
            }
        }
        return playlists;
    }
    public static Playlist getAllPlaylistById(int id) throws SQLException {
        Playlist returnedPlaylist =new Playlist();
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            //STEP 4: Execute a query
            stmt = conn.createStatement();

            String sqlQuery = "SELECT id,name FROM playlists WHERE id= "+id;
            List<Playlist> pls=new ArrayList<>();

            ResultSet rs = stmt.executeQuery(sqlQuery);
            while (rs.next()) {
                String name = rs.getString("name");


                Playlist playlist =new Playlist(id,name);
                pls.add(playlist);
            }
            if (pls.size()==0){
                return null;
            }
            returnedPlaylist=pls.get(0);
        } catch (SQLException | ClassNotFoundException err) {
            //Handle errors for JDBC
            err.printStackTrace();

        } finally {
            //finally block used to close resources

            if (conn != null) {
                conn.close();
            }
        }
        return returnedPlaylist;
    }
}