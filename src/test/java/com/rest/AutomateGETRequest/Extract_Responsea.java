package com.rest.AutomateGETRequest;

import static io.restassured.RestAssured.*;

import io.restassured.response.Response;
import org.testng.annotations.Test;

import static org.hamcrest.Matchers.hasItems;

public class Extract_Responsea {

    @Test
    public void extractResponse(){
        // given() = we sent url, body,Authorization,Parameter or As like data by this Method.

        // When() = what type of action we perform that sent by this method

        // then() = Show /Validate  outcome by this method.
       Response res  =  given()
                .baseUri("https://reqres.in/")
                .when()
                .get("/api/users?page=2")
                .then()
                .assertThat()
                .statusCode(200).
               extract().response();

        System.out.println("Response Is"+res.asString());



    }


}
