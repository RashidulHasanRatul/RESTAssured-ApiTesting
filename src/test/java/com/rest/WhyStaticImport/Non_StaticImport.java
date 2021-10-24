package com.rest.WhyStaticImport;

import io.restassured.RestAssured;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

public class Non_StaticImport {

    @Test
    public void NonstaticimportExample(){
        RestAssured.given()
                .baseUri("https://api.postman.com")
                .header("hjh","")
                .when()
                .get("/workspaces")
                .then()
                .statusCode(200)
                .body("Name",Matchers.is(Matchers.equalTo("Rashidul")),
                        "Email",Matchers.is(Matchers.equalTo("rashidulhasan.swe@gmail.com")));
    }

}
