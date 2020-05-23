package apiTest;

import com.google.gson.Gson;
import helpers.Token;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import models.CreatePlaylistRequest;
import models.CreatePlaylistResponse;
import models.DataResponsePlaylists;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class PlaylistTests {
    private String token;
//    @Parameters({"email","password"})
    @BeforeMethod
    public void init(){
        token = Token.retrieveToken("testpro.user02@testpro.io","te$t$tudent02");
    }

    @Test
    public void playlistTests_CreatePlaylist_PlaylistCreated(){
        String[] rules = {};
        var playlist = new CreatePlaylistRequest("AAAtttAAA",rules);
        var requestBody = new Gson().toJson(playlist);

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
        Assert.assertEquals(playlist.name,createdPlaylist.name);
        Assert.assertEquals(createdPlaylist.songs.length,0);
    }

    @Test
    public void getAllData_DataReturned(){
        Response response = given()
                .baseUri("https://koelapp.testpro.io/")
                .header("Authorization","Bearer "+token)
                .basePath("api/data")
                .when()
                .get()
                .then()
                .statusCode(200)
                .extract()
                .response();

        JsonPath jsonPath = response.jsonPath();
        var data = jsonPath.getObject("$", DataResponsePlaylists.class);
        System.out.println(data.playlists.length);
    }

}
