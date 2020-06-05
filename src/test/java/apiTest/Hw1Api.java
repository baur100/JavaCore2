package apiTest;

import com.google.gson.Gson;
import helpers.Data;
import helpers.TestData;
import helpers.Token;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import models.*;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.*;

import static io.restassured.RestAssured.*;

public class Hw1Api {
    private String token;
    private int playlist_id;
    private String playlistName = TestData.randomString();
    private String newPlaylistName = TestData.randomString();

    //    @Parameters({"email","password"})
    @BeforeSuite
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

    @BeforeMethod
    public void playlistTests_createPlaylist_PlaylistCreated() {

        String[] rules = {};
        var playlist = new CreatePlaylistRequest(playlistName, rules);
        var requestBody = new Gson().toJson(playlist);

        Response response = given()
                .baseUri("https://koelapp.testpro.io/")
                .header("Authorization", "Bearer " + token)
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
        CreatePlaylistResponse createdPlaylist = jsonPath.getObject("$", CreatePlaylistResponse.class);
        playlist_id = createdPlaylist.id;


    }


        @Test
        public void playlistTests_renamePlaylist_PlaylistRenamed(){
            var reNamedPlaylist = new RenamePlaylistRequest(newPlaylistName);
            var requestBodyRenamePlaylist = new Gson().toJson(reNamedPlaylist);
        Response responseOne = given()
                .baseUri("https://koelapp.testpro.io/")
                .header("Authorization","Bearer "+token)
                .basePath("api/playlist/"+playlist_id)
                .contentType(ContentType.JSON)
                .body(requestBodyRenamePlaylist)
                .when()
                .patch()
                .then()
                .statusCode(200)
                .extract()
                .response();

        JsonPath jsonPathOne = responseOne.jsonPath();
        RenamePlayListResponse renamedPlaylist = jsonPathOne.getObject("$",RenamePlayListResponse.class);

        Assert.assertNotEquals(renamedPlaylist.name,playlistName);
        Assert.assertEquals(renamedPlaylist.id,playlist_id);
        var data = Data.getData();
        List<Playlist> renamedPlaylists = new ArrayList<Playlist>(Arrays.asList(data.playlists));
        int count=0;
        for(Playlist pl:renamedPlaylists){
            if(pl.id==renamedPlaylist.id){
                count++;
            }
        }
        Assert.assertEquals(count,1);
    }



}