package org.ec.proxy;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.awt.*;

@Path("/")
@RegisterRestClient
public interface ClientProxy {

    @GET
    @Path("/server")
    @Produces(MediaType.TEXT_PLAIN)
    String call();
    
}
