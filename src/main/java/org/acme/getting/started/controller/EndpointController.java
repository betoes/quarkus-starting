package org.acme.getting.started.controller;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.acme.getting.started.model.Endpoint;
import org.acme.getting.started.service.EndpointService;

@ApplicationScoped
@Path("/endpoint")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class EndpointController {
	@Inject
	private EndpointService endpointServ;
	
	@POST
	@Path("/save")
	@Produces(MediaType.APPLICATION_JSON)
	public Response saveEndpoint(Endpoint endpoint) {
		endpointServ.save(endpoint);
		return Response.ok().build();
	}
	
	@GET
	@Path("/all")
	@Produces("application/json")
	public Response all() {
		List<Endpoint> end = endpointServ.listEndpoints();
		return Response.ok(end).build();
	}
	
}
