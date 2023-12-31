package com.massacre.cloudnative;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class InventoryResourceTest {

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/api/inventory/hello")
          .then()
             .statusCode(200)
             .body(is("Hello RESTEasy"));
    }

}