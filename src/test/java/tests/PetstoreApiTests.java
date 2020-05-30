package tests;

import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;


public class PetstoreApiTests {
    @Test
    public void getPetById() {
        Response response =
                given()
                        .baseUri("https://petstore.swagger.io")
                .when()
                        .get("v2/pet/111")
                 .then()
                        .statusCode(404)
                        .extract()
                        .response();
//        Response response =get("https://petstore.swagger.io/v2/111" )
//                .thenReturn();
        var jsonPath = response.jsonPath();
        System.out.println(jsonPath.prettify());


        //when().get("https://petstore.swagger.io/v2/pet/111").thenReturn();
    }
}
