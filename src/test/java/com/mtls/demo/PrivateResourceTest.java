package com.mtls.demo;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static com.mtls.demo.utils.Endpoints.PRIVATE_ENDPOINT;
import static io.restassured.RestAssured.given;

@QuarkusTest
class PrivateResourceTest {

    @Test
    void privateEndpoint() {
        given()
                .when().get(PRIVATE_ENDPOINT)
                .then()
                .statusCode(200);
    }
}