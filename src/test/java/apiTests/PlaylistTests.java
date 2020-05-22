package apiTests;

import com.google.gson.Gson;
import helpers.Token;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import models.CreatePlaylistRequest;
import models.CreatePlaylistResponse;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PlaylistTests {
    private final String TOKEN = Token.getToken();

    @Test
    public void playlistTest_CreatePlaylist_PlaylistCreated() {
        var playlist = new CreatePlaylistRequest("Zzounds", new String[0]);
        var requestBody = new Gson().toJson(playlist);

        Response response = RestAssured.given()
                    .baseUri("https://koelapp.testpro.io/")
                    .header("Authorization", TOKEN)
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
        Assert.assertEquals(playlist.name, createdPlaylist.name);
        Assert.assertEquals(createdPlaylist.songs.length, 0);
    }
}
