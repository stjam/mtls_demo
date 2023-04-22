package com.mtls.demo;

import io.vertx.core.http.HttpServerRequest;
import io.vertx.ext.web.RoutingContext;

import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import java.util.Map;

import static com.mtls.demo.utils.Endpoints.PRIVATE_ENDPOINT;

@Path(PRIVATE_ENDPOINT)
public class PrivateResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String privateEndpoint(RoutingContext rc) {
        HttpServerRequest request = rc.request();
        StringBuilder responseBuilder = new StringBuilder();

        for (Map.Entry<String, String> header : request.headers()) {
            responseBuilder.append(header.getKey())
                    .append(": ")
                    .append(header.getValue())
                    .append("\n");
        }

        return responseBuilder.toString();
    }
}