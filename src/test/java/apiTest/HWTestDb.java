package apiTest;


import helpers.HwDbAdapter;
import models.Playlist;
import models.SongsOfArtist;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.SQLException;

public class HWTestDb {

        @Test
        public void getSongs_ListOfAllSongs_returned() throws SQLException {
            HwDbAdapter.getAllSongs();
        }
        @Test
        public void getListOfSongsByArtistId() throws SQLException {
            SongsOfArtist songs = HwDbAdapter.getListOfSongsByNameOfArtist("Ketsa");

            Assert.assertTrue(songs.name.equals("Ketsa"));
        }
    }

