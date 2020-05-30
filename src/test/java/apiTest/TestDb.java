package apiTest;

import helpers.DbAdapter;
import models.Playlist;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.SQLException;

public class TestDb {
    @Test
    public void getArtists_ListOfArtistReturned() throws SQLException {
        DbAdapter.getArtists();
    }

    @Test
    public void getPlaylists_ListOfPlaylists_returned() throws SQLException {
        DbAdapter.getAllPlaylists();
    }

    @Test
    public void getSinglePlaylistById() throws SQLException {
        Playlist pl = DbAdapter.getPlaylistsById(19);
        Assert.assertEquals(pl.name,"Dima");
    }
}
