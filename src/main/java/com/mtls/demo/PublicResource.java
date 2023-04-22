package com.mtls.demo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import java.time.LocalDateTime;

import static com.mtls.demo.utils.Endpoints.PUBLIC_ENDPOINT;
@Path(PUBLIC_ENDPOINT)
public class PublicResource {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public LocalDateTime publicEndpoint() {
        return LocalDateTime.now();
    }
}
