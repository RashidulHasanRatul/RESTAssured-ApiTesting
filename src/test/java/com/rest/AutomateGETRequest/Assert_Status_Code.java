package com.rest.AutomateGETRequest;

import io.restassured.RestAssured;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.*;
public class Assert_Status_Code {

    @Test
    public void assertStatusCode(){
        // given() = we sent url, body,Authorization,Parameter or As like data by this Method.

        // When() = what type of action we perform that sent by this method

        // then() = Show /Validate  outcome by this method.
        RestAssured.given()
                            .baseUri("https://reqres.in/")
                .when()
                             .get("/api/users?page=2")
                .then()
                           .assertThat()
                             .statusCode(200).
                body("Workspace.name",hasItems(""))
                            .log().all();

    }







}
