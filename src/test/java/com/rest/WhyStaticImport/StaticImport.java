package com.rest.WhyStaticImport;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;

public class StaticImport {

    @Test
    public void staticimportExample(){
        given()
                .baseUri("https://api.postman.com")
                .header("hjh","")
                .when()
                .get("/workspaces")
                .then()
                .statusCode(200)
                .body("Name",is(equalTo("Rashidul")),
                        "Email",is(equalTo("rashidulhasan.swe@gmail.com")));
    }


}
