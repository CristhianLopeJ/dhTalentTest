package com.talent;

import com.talendModel.People;
import com.talent.bind.BaseApi;
import com.talent.bind.BaseApiResponse;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.talent.bind.BaseApi.getRequestResponse;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;

public class SWApiTestithRestAssured extends BaseApi {

    //    private BaseApiResponse baseApiResponse;
    private static People people = new People();

    @BeforeClass
    public static void setUp() {
        Response response = getRequestResponse("/people/1/");
        people.name = response.path("name");
    }

    @Test
    public void getTestName() {
        Assert.assertEquals("name", people.name);
    }


//        this.baseApiResponse = RestAssured
//                .given()
//                .baseUri("https://swapi.dev/api")
//                .and()
//                .queryParam("format", "json")
//                .when()
//                .get("/")
//                .then()
//                .and().assertThat().statusCode(is(equalTo(200)))
//                .and()
//                .body("people", response -> notNullValue())
//                .body("planets", response -> notNullValue())
//                .body("films", response -> notNullValue())
//                .body("species", response -> notNullValue())
//                .body("vehicles", response -> notNullValue())
//                .and().extract().body().as(BaseApiResponse.class);
}

//practicing RESTASSURED
//    @Test
//    public void requestAResourcesFilmsThenLinkToReturn() {
//        RestAssured
//                .given()
//                .queryParam("format", "json")
//                .log().all()
//                .when()
//                .post(baseApiResponse.getFilms())
//                .then()
//                .log().all()
//                .and()
//                .body("detail", is("Method 'POST' not allowed."))
//                .statusCode(is(equalTo(405)));
//}
//practicing RESTASSURED
//    @Test
//    public void requestAResourcesFilmsThenLinkToReturn1() {
//        RestAssured
//                .given()
//                .queryParam("format", "json")
//                .log().all()
//                .when()
//                .post(baseApiResponse.getFilms())
//                .then()
//                .log().all()
//                .and()
//                .body("detail", is("Method 'POST' not allowed."))
//                .statusCode(is(equalTo(405)));
//        }
//        }

