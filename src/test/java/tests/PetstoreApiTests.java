package tests;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class PetstoreApiTests {

    @Test
    public void createPet() {
        baseURI = "https://petstore.swagger.io";

        String requestBody = "{\n" +
                "  \"id\": 1112,\n" +
                "  \"category\": {\n" +
                "    \"id\": 0,\n" +
                "    \"name\": \"string\"\n" +
                "  },\n" +
                "  \"name\": \"Testdoggie\",\n" +
                "  \"photoUrls\": [\n" +
                "    \"string\"\n" +
                "  ],\n" +
                "  \"tags\": [\n" +
                "    {\n" +
                "      \"id\": 0,\n" +
                "      \"name\": \"string\"\n" +
                "    }\n" +
                "  ],\n" +
                "  \"status\": \"available\"\n" +
                "}";

        Response response = null;

        try {
            response = given()
                    .contentType(ContentType.JSON)
                    .body(requestBody)
                    .post("v2/pet");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void getPetById() {
        Response response = given()
                .baseUri("https://petstore.swagger.io")
                .get("v2/pet/1112")
                .then()
                .statusCode(200)
                .extract()
                .response();
        System.out.println(response.jsonPath().prettify());

        //when().get("https://petstore.swagger.io/v2/pet/111").thenReturn();
    }
}
