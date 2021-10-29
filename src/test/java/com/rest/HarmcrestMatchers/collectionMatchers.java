package com.rest.HarmcrestMatchers;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class collectionMatchers {

    @Test
    public void collection_Matcher(){

        given()
                .baseUri("")
                .get()
                .body("Workspace.id",hasItems("cdf","fdf",""),
                "Workspace.name",hasItems("fdf","df"),
                        "Workspace.name",hasItems("fdf","df")
                );

    }
}
