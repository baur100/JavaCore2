package apiTest;
import helpers.Token;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

public class NasApiCall {
    private String token;

    @BeforeMethod
    public void init() {
        token = Token.retrieveToken("abc@xyz.com", "Testtest123!");
    }

    @Test
    public void bookTest() {

        Response response =
                given()
                        .baseUri("http://booklibrarywebapidev.azurewebsites.net/")
                        .header("Authorization", "Bearer " + token)
                        .basePath("api/books/id/802")

                        .contentType(ContentType.JSON)
                .when()
                        .get()
                .then()
                        .statusCode(200)
                        .extract()
                        .response();

        JsonPath jsonPath = response.jsonPath();
        System.out.println(jsonPath.prettify());
    }
}




