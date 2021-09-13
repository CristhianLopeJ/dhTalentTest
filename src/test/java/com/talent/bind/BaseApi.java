package com.talent.bind;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public abstract class BaseApi {

    protected final static String BASE_URL = "https://swapi.dev/api";

    public static Response getRequestResponse(String request) {
        RestAssured.baseURI = BASE_URL;
        RequestSpecification httpRequest = RestAssured.given();
        return httpRequest.get(request);

    }
}
