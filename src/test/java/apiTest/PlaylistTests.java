package apiTest;

import com.google.gson.Gson;
import helpers.Data;
import helpers.TestData;
import helpers.Token;
import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import models.CreatePlaylistRequest;
import models.CreatePlaylistResponse;
import models.DataResponse;
import models.Playlist;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static io.restassured.RestAssured.*;

public class PlaylistTests {
    private String token;
    private int playlist_id;
//    @Parameters({"email","password"})
    @BeforeMethod
    public void init(){
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
    public void playlistTests_CreatePlaylist_PlaylistCreated(){
        String playlistName = TestData.randomString();
        String[] rules = {};
        var playlist = new CreatePlaylistRequest(playlistName,rules);
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
        playlist_id=createdPlaylist.id;
        Assert.assertEquals(playlist.name,createdPlaylist.name);
        Assert.assertEquals(createdPlaylist.songs.length,0);
        var data = Data.getData();
        List<Playlist> playlists = new ArrayList<Playlist>(Arrays.asList(data.playlists));
        int count=0;
        for(Playlist pl:playlists){
            if(pl.id==createdPlaylist.id){
                count++;
            }
        }
        Assert.assertEquals(count,1);
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
        var data = jsonPath.getObject("$", DataResponse.class);
        System.out.println(data.playlists.length);
    }

}
