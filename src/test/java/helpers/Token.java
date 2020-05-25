package helpers;

import com.google.gson.Gson;
import helpers.Token;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import models.CreatePlaylistRequest;
import io.restassured.response.Response;
import models.CreatePlaylistResponse;
import models.CreateTokenRequest;
import models.CreateTokenResponce;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

import static io.restassured.RestAssured.given;

public class Token {
    public static String retrieveToken(){
        String token="";
        //Place your code here
        var tokenRequest = new CreateTokenRequest("testpro.user02@testpro.io", "te$t$tudent02");
        var tokenRequestBody = new Gson().toJson(tokenRequest);

        Response response = given()
                .baseUri("https://koelapp.testpro.io/")
                .basePath("api/me")
                .contentType(ContentType.JSON)
                .body(tokenRequestBody)
        .when()
            .post()
        .then()
            .statusCode(200)
            .extract()
            .response();

        JsonPath jsonPath = response.jsonPath();
        CreateTokenResponce createToken = jsonPath.getObject("$", CreateTokenResponce.class);
        token = createToken.token;

        return token;
    }
}
