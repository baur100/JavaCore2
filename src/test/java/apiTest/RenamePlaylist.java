package apiTest;

import com.google.gson.Gson;
import helpers.Data;
import helpers.TestData;
import helpers.Token;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import models.Playlist;
import models.RenamePlayListResponse;
import models.RenamePlaylistRequest;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static io.restassured.RestAssured.given;

public class RenamePlaylist {
    private int id;
    private String token;
    @BeforeMethod
    public void startUp(){
        String name = TestData.randomString();
       var createdPlaylist =  Data.createPlaylist(name);
       id = createdPlaylist.id;
        token = Token.retrieveToken("testpro.user02@testpro.io","te$t$tudent02");

    }
    @AfterMethod
    public void tearDown(){
        Response response = given()
                .baseUri("https://koelapp.testpro.io/")
                .header("Authorization","Bearer "+token)
                .basePath("api/playlist/"+id)
                .when()
                .delete();

    }
     @Test
    public void renamePlaylist_PlaylistRenamed(){
        String newName= TestData.randomString();
         RenamePlaylistRequest renamePlaylistRequest = new RenamePlaylistRequest(newName);
         var requestBodyRenamePlaylist = new Gson().toJson(renamePlaylistRequest);
         Response responseOne = given()
                 .baseUri("https://koelapp.testpro.io/")
                 .header("Authorization","Bearer "+token)
                 .basePath("api/playlist/"+id)
                 .contentType(ContentType.JSON)
                 .body(requestBodyRenamePlaylist)
                 .when()
                 .patch()
                 .then()
                 .statusCode(200)
                 .extract()
                 .response();

         JsonPath jsonPathOne = responseOne.jsonPath();
         var playlist = jsonPathOne.getObject("$",RenamePlayListResponse.class);

         Assert.assertNotEquals(playlist.name,newName);
         Assert.assertEquals(playlist.id,id);
         var data = Data.getData();
         int count =0;
         for(Playlist pl: data.playlists){
             if(pl.name.equals(newName)){

              count++;
             }
         }
         Assert.assertEquals(count,1);
     }
}

