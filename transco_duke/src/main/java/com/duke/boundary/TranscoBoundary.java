package com.duke.boundary;

import javax.inject.Inject;
import javax.json.Json;
import javax.json.JsonObjectBuilder;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import com.duke.controller.TranscoController;

@Path("transco")
public class TranscoBoundary {

	@Inject
	TranscoController tc;
	
	@POST
	@Path("_search")
	public Response getTransco(String s){
		JsonObjectBuilder builder = Json.createObjectBuilder();
		builder.add("request", s);
		builder.add("response", tc.GetOneStringFromPredicate(s));
		return Response.ok(builder.build()).build();
	}

}
