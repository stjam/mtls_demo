package com.mtls.demo;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static com.mtls.demo.utils.Endpoints.PUBLIC_ENDPOINT;
import static io.restassured.RestAssured.given;
@QuarkusTest
class PublicResourceTest {

    @Test
    void publicEndpoint() {
        given()
                .when().get(PUBLIC_ENDPOINT)
                .then()
                .statusCode(200);
    }
}