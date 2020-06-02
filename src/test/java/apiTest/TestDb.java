package apiTest;

import helpers.DbAdapter;
import models.Playlist;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.SQLException;

public class TestDb {
    @Test
    public void getArists_ListOfArtistReturned() throws SQLException {
        DbAdapter.getArtists();
    }

    @Test
    public void getPlaylists_ListOfPlaylists_returned() throws SQLException {
        DbAdapter.getAllPlaylist();
    }

    @Test
    public void getSinglePlaylistById() throws SQLException {
        Playlist pl =DbAdapter.getAllPlaylistById(19);
        Assert.assertEquals(pl.name,"Dima");
    }
}
