package apiTest;

import com.google.gson.Gson;
import helpers.Token;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import models.CreatePlaylistRequest;
import io.restassured.response.Response;
import models.CreatePlaylistResponse;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class PlaylistTests {
    private String token;
    @BeforeMethod
    public void init(){
        token = Token.retrieveToken();
    }

//    private final String TOKEN = "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOjMwMCwiaXNzIjoiaHR0cHM6Ly9rb2VsYXBwLnRlc3Rwcm8uaW8vYXBpL21lIiwiaWF0IjoxNTkwMDI2NzQwLCJleHAiOjE1OTA2MzE1NDAsIm5iZiI6MTU5MDAyNjc0MCwianRpIjoiQ1ZydTBCUTdPVHlydFpmTSJ9.kRvurIf5uDpIiWn0DoJBBUoT1taBu_k3jqDznMlZtDQ";

    @Test
    public void playlistTests_CreatePlaylist_PlaylistCreated(){
        String[] rules = {};
        var playlist = new CreatePlaylistRequest("AAAtttAAA",rules);
        var requestBody = new Gson().toJson(playlist);

        Response response = given()
                .baseUri("https://koelapp.testpro.io/")
                .header("Authorization",token)
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

}
