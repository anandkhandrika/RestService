package com.anand.rest.status;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/v1/status")
public class V1_status {

	/**
	 * @param args
	 */
	@GET
	@Produces(MediaType.TEXT_HTML)	
	public String returnStatus(){
		return "<p>java</p>";
	}

}
