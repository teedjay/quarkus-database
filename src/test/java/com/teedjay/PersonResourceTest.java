package com.teedjay;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

@QuarkusTest
class PersonResourceTest {

    @Test
    void getAll() {
        // Expected : [{"id":1,"name":"Vicky"},{"id":2,"name":"Teedjay"},{"id":3,"name":"Stonka"}]
        given()
          .when().get("/person")
          .then()
            .statusCode(200)
            .body("size()", is(3))
            ;
    }

    @Test
    void getById() {
        // Expected : {"id":2,"name":"Teedjay"}%
        given()
          .pathParam("id", 2)
          .when().get("/person/{id}")
          .then()
            .statusCode(200)
            .body("name", is("Teedjay"));
    }

}
