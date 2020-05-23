package apiTests;

import com.google.gson.Gson;
import helpers.Token;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import models.CreatePlaylistRequest;
import models.CreatePlaylistResponse;
import models.DataResponse;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import javax.xml.crypto.Data;

public class PlaylistTests {
    private String TOKEN;

    @Parameters({"email", "password"})
    @BeforeMethod
    public void init(String login, String pwd) {
        TOKEN = Token.getToken(login, pwd);
    }

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

    @Test
    public void getAllData_DataReturned() {
        Response response = RestAssured.given()
                .baseUri("https://koelapp.testpro.io/")
                .header("Authorization", TOKEN)
                .basePath("api/data")
                .when()
                .get()
                .then()
                .statusCode(200)
                .extract()
                .response();

        JsonPath jsonPath = response.jsonPath();

        System.out.println(jsonPath.prettify());
        DataResponse data = jsonPath.getObject("$", DataResponse.class);
        System.out.println(data.toString());
    }
}
