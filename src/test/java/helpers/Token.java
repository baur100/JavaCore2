package helpers;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import models.TokenRequest;

public class Token {
    public static String getToken(String login, String pwd) {
        TokenRequest requestBody = new TokenRequest(login, pwd);

        Response response = RestAssured.given()
                    .baseUri("https://koelapp.testpro.io/")
                    .basePath("api/me")
                    .contentType(ContentType.JSON)
                    .body(requestBody)
                .when()
                    .post()
                .then()
                    .statusCode(200)
                    .extract()
                    .response();
        return "Bearer " + response.jsonPath().getString("token");
    }
}
