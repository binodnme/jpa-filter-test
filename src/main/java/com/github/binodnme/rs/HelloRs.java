package com.github.binodnme.rs;

import com.github.binodnme.service.TestService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * @author Binod Shrestha <binodshrestha@lfetchnology.com> on 11/10/2016.
 */
@Path("/")
public class HelloRs {
    @Inject
    private TestService testService;

    @Path("/")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response helloWorld(){
        return Response.ok().entity(testService.testMethod()).build();
    }

}
