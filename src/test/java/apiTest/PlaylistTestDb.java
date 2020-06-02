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
        given()
                .baseUri("https://koelapp.testpro.io/")
                .header("Authorization","Bearer "+token)
                .basePath("api/playlist/"+playlist_id)
                .when()
                .delete();
    }
    @Test
    public void playlistTestsDb_CreatePlaylist_PlaylistCreated() throws SQLException {
        String playlistName = TestData.randomString();
        String[] rules = {};
        var createPlaylist = new CreatePlaylistRequest(playlistName,rules);
        var requestBody = new Gson().toJson(createPlaylist);

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
        Assert.assertEquals(createPlaylist.name,createdPlaylist.name);
        Assert.assertEquals(createdPlaylist.songs.length,0);
        Playlist playlist = DbAdapter.getPlaylistsById(playlist_id);
        Assert.assertNotNull(playlist,"Object not found in DB");

        Assert.assertEquals(playlistName,playlist.name);
    }
}
