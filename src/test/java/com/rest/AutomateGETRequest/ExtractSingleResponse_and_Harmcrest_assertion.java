package com.rest.AutomateGETRequest;

import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class ExtractSingleResponse_and_Harmcrest_assertion {

    @Test
    public void extractSingleRespons_And_HarmcrestAssertion(){
        // given() = we sent url, body,Authorization,Parameter or As like data by this Method.

        // When() = what type of action we perform that sent by this method

        // then() = Show /Validate  outcome by this method.
        int id  =  given()
                .baseUri("https://reqres.in/")
                .when()
                .get("/api/users?page=2")
                .then()
                .assertThat()
                .statusCode(200).
                extract().response().path("data[0].id");

                 System.out.println("Response Is : = "+id);

                assertThat(id,equalTo(7));





    }


}
