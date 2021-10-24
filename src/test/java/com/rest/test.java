package com.rest;

    import static   io.restassured.RestAssured.*;
    import static io.restassured.matcher.RestAssuredMatchers.*;
    import static  org.hamcrest.Matchers.*;

    import io.restassured.RestAssured;
    import org.testng.annotations.Test;

public class test {

    @Test
    public void test(){
        RestAssured.given()
                .when()
            .then();

    }

}
