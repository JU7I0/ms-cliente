package org.juliobarros;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

    private static final Logger LOGGER = LoggerFactory.getLogger(GreetingResource.class); 
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        LOGGER.info(" >>>> LOG <<<<<<");
        return "Ola mundo";
    }
}
