package helpers;

import com.google.gson.Gson;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import models.CreatePlaylistRequest;
import models.CreatePlaylistResponse;
import models.DataResponse;

import static io.restassured.RestAssured.given;

public class Data {
    public static DataResponse getData() {
        String token = Token.retrieveToken("testpro.user02@testpro.io", "te$t$tudent02");
        Response response = given()
                .baseUri("https://koelapp.testpro.io/")
                .header("Authorization", "Bearer" + token)
                .basePath("api/data")
                .when()
                .get()
                .then()
                .statusCode(200)
                .extract()
                .response();

        JsonPath jsonPath = response.jsonPath();
        return jsonPath.getObject("$", DataResponse.class);
    }

    public static CreatePlaylistResponse createPlaylist(String playlistName) {
        String token = Token.retrieveToken("testpro.user02@testpro.io", "te$t$tudent02");
        String[] rules = {};
        var playlist = new CreatePlaylistRequest(playlistName, rules);
        var requestBody = new Gson().toJson(playlist);

        Response response = given()
                .baseUri("https://koelapp.testpro.io/")
                .header("Authorization", "Bearer" + token)
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
        return jsonPath.getObject("$", CreatePlaylistResponse.class);
    }
}


