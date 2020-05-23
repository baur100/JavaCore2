package helpers;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import models.DataResponse;

import static io.restassured.RestAssured.given;

public class Data {
    public static DataResponse getData(){
        String token = Token.retrieveToken("testpro.user02@testpro.io","te$t$tudent02");
        Response response = given()
                .baseUri("https://koelapp.testpro.io/")
                .header("Authorization","Bearer "+token)
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
}
