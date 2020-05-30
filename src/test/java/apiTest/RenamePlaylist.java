package apiTest;

import com.google.gson.Gson;
import helpers.Data;
import helpers.TestData;
import helpers.Token;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import models.CreatePlaylistResponse;
import models.Playlist;
import models.RenamePlaylistRequest;
import models.RenamePlaylistResponse;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class RenamePlaylist {
    private int id;
    private String token;

    @BeforeMethod
    public void startUp() {
        String name = TestData.randomString();
        var createdPlaylist = Data.createPlaylist(name);
        id = createdPlaylist.id;
        token = Token.retrieveToken("testpro.user02@testpro.io", "te$t$tudent02");
    }

    @AfterMethod
    public void tearDown() {
        Response response = given()
                .baseUri("https://koelapp.testpro.io/")
                .header("Authorization", "Bearer" + token)
                .basePath("api/playlist/" + id)
                .when()
                .delete();

    }

    @Test
    public void renamePlaylistRenamed() {
        String newName = TestData.randomString();
        RenamePlaylistRequest renamePlaylistRequest = new RenamePlaylistRequest(newName);
        var requestBody = new Gson().toJson(renamePlaylistRequest);

        Response response = given()
                .baseUri("https://koelapp.testpro.io/")
                .header("Authorization", "Bearer" + token)
                .basePath("api/playlist/" + id)
                .contentType(ContentType.JSON)
                .body(requestBody)
                .when()
                .put()
                .then()
                .statusCode(200)
                .extract()
                .response();

        JsonPath jsonPath = response.jsonPath();
        var playlist = jsonPath.getObject("$", RenamePlaylistResponse.class);
        Assert.assertEquals(playlist.name, newName);
        Assert.assertEquals(playlist.id, id);

        var data = Data.getData();
        int count = 0;
        for (Playlist pl : data.playlists) {
            if (pl.name == (newName)) {
                count++;
            }
        }

        Assert.assertEquals(count, 0);
    }

}

