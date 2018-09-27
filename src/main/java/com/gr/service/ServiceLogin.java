package com.gr.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.gr.HelloWOrld.Employee;

@Path("/javalogin")
public class ServiceLogin {
	
	@POST
	@Path("/validate")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Employee validUser(Employee em) {
		em.setValidUser(false);
		if(em.getFirstName().equals("arif") && em.getUserName().equals("amehmood")) {
			em.setValidUser(true);
		}
		return em;
	}
	
	@GET
    @Path("/helloworld")
    public Response getHelloWorld() {
        String value = "Hello World";
        return Response.status(200).entity(value).build();
    }
    
    @GET
    @Path("")
    public Response get() {
        String value = "Hello World";
        return Response.status(200).entity(value).build();
    }
	
}
