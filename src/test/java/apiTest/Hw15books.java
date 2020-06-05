package apiTest;

import com.google.gson.Gson;
import helpers.Data;
import helpers.TestData;
import helpers.Token;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import models.*;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.*;

import static io.restassured.RestAssured.given;

public class Hw15books {
    private String token;
    private int playlist_id;
    private String newBookLabel;
    private int bookId = 802;
    private String bookLabel ="Hey";
    private Map<String, String> headers;
    private final String baseUrl = "http://booklibrarywebapidev.azurewebsites.net/";

    public void booksBaseTest(){
        headers=new HashMap<>();
        headers.put("Authorization","Basic YWJjQHh5ei5jb206VGVzdHRlc3QxMjMh");
        headers.put("Content-Type","application/JSON");
    }

    @Test
    public void getAutentificationBooks(){
        RestAssured.baseURI=baseUrl;
        RestAssured.given().auth().basic("abc@xyz.com","Testtest123!")
                .when()
                .get()
                .then()
                .assertThat()
                .statusCode(200);


    }



    @Test
    public void getBookById_BookReturned(int bookId,String bookLabel) {
        Response response = given()
                .baseUri(baseUrl)
                .auth().basic("abc@xyz.com","Testtest123!")
                .basePath("api/books/id/"+bookId)
                .when()
                .get()
                .then()
                .statusCode(200)
                .extract()
                .response();

        JsonPath jsonPath = response.jsonPath();
        GetBookByIdResponse getBookByIdResponse = jsonPath.getObject("$", GetBookByIdResponse.class);
        newBookLabel=getBookByIdResponse.label;
        Assert.assertEquals(bookLabel,newBookLabel);

    }
}
