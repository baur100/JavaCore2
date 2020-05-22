package helpers;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import models.LoginToApp;

public class Token {
    public static String getToken() {
        LoginToApp requestBody = new LoginToApp("testpro.user02@testpro.io", "te$t$tudent02");

        Response response = RestAssured.given()
                .baseUri("https://koelapp.testpro.io/")
                .contentType(ContentType.JSON)
                .body(requestBody)
                .post("api/me");
        return "Bearer " + response.jsonPath().getString("token");
    }
}
