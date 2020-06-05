package apiTest;

import com.google.gson.Gson;
import helpers.Data;
import helpers.DbAdapter;
import helpers.TestData;
import helpers.Token;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import models.CreatePlaylistRequest;
import models.CreatePlaylistResponse;

import models.Playlist;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static io.restassured.RestAssured.given;

public class PlaylistTestDb {
    private int playlist_id;
    private String token;
    @BeforeMethod
    public void startUp(){
        token = Token.retrieveToken("testpro.user02@testpro.io","te$t$tudent02");

    }
    @AfterMethod
    public void tearDown(){
        Response response = given()
                .baseUri("https://koelapp.testpro.io/")
                .header("Authorization","Bearer "+token)
                .basePath("api/playlist/"+playlist_id)
                .when()
                .delete();
    }
    @Test
    public void playlistTests_CreatePlaylistDb_PlaylistCreated() throws SQLException {
        String playlistName = TestData.randomString();
        String[] rules = {};
        var CreatedPlaylist = new CreatePlaylistRequest(playlistName,rules);
        var requestBody = new Gson().toJson(CreatedPlaylist);

        Response response = given()
                .baseUri("https://koelapp.testpro.io/")
                .header("Authorization","Bearer "+token)
                .basePath("api/playlist")
                .contentType(ContentType.JSON)
                .body(requestBody)
                .when()
                .post()
                .then()
                .statusCode(200)
                .extract()
                .response();

        JsonPath jsonPath = response.jsonPath();
        CreatePlaylistResponse createdPlaylist = jsonPath.getObject("$",CreatePlaylistResponse.class);
        playlist_id=createdPlaylist.id;
        Assert.assertEquals(CreatedPlaylist.name,createdPlaylist.name);
        Assert.assertEquals(createdPlaylist.songs.length,0);

        Playlist playlist = DbAdapter.getPlaylistsById(playlist_id);

        Assert.assertNotNull(playlist, "Object is not't found on DB");

        Assert.assertNotEquals(playlistName, playlist.name);

            }
        }


