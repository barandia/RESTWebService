package com.jb.webservice.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author benjiearandia
 */
@Path("myresource")
public class MyResource {
    
    /**
     * Method handling HTTP GET requests. The returned object will be sent to 
     * the client as "text/plain" media type.
     * @return 
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        return "Benjie's Web Service using Jersey 2.x!";
    }
}
