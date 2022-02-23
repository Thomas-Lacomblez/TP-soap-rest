package com.objis.demorest;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/hello")
public class HelloService {

    @GET
    @Path("/{param}")
    public Response getMsg(@PathParam("param") String msg) {

        String output = "Jersey repond via OBJIS : " + msg;

        return Response.status(200).entity(output).build();

    }

    @GET
    @Path("/")
    public Response getMsgWithoutParam() {

        String output = "Jersey repond via OBJIS : Bienvenue Ensup ! ";

        return Response.status(200).entity(output).build();

    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/")
    public Response postMsg( String msg) {

        return Response.status(200).entity("").build();
    }
}
